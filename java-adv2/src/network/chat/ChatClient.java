package network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

import static util.MyLogger.log;

public class ChatClient {

    private static final int PORT = 21311;

    public static void main(String[] args) {
        log("클라이언트 시작");

        AtomicReference<String> name = new AtomicReference<>();

        try (Socket socket = new Socket("localhost", PORT);
             DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output = new DataOutputStream(socket.getOutputStream());
         ) {

            log("소켓 연결");

            // 읽기 쓰레드
            Thread reader = new Thread(() -> {
                try {
                    while (true) {
                        String received = input.readUTF();
                        log("client <- server: " + received);
                        if (received.equals("exit")) break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // 보내기 쓰레드
            Thread writer = new Thread(() -> {
                try (Scanner scanner = new Scanner(System.in)) {
                    while (true) {
                        log("입력: ");
                        String toSend = scanner.nextLine();

                        if (toSend.startsWith("/join|")) {
                            String[] parts = toSend.split("\\|", 2);
                            if (parts.length == 2) {
                                output.writeUTF(toSend);
                                name.set(parts[1].trim());
                                log("입장하였습니다." + name.get());
                            }
                        }

                        if (toSend.startsWith("/message|")) {
                            output.writeUTF(toSend);
                        }

                        if (toSend.startsWith("/change|")) {
                            if (name.get() == null) {
                                log("이름없음.");
                            }
                            String[] parts = toSend.split("\\|", 2);
                            if (parts.length == 2) {
                                output.writeUTF(parts[1].trim());
                                name.set(parts[1].trim());
                            }
                        }

                        if (toSend.equals("/user")) {
                            // 전체 사용자 목록 출력
                        }

                        if (toSend.equals("/exit")) break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            reader.start();
            writer.start();

            reader.join();
            writer.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
