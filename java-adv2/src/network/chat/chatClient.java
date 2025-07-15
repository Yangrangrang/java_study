package network.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class chatClient {

    private static final int PORT = 12345;

    public static void main(String[] args) {

        log("클라이언트 시작");

        try (Socket socket = new Socket("localhost", PORT)) {
            ReadHandler(socket);



        } catch (IOException e) {
            log(e);
        }

    }

    private static void ReadHandler(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(socket.getInputStream());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("전송 문자: ");
            String toSend = scanner.nextLine();

            if (toSend.equals("exit")) {
                break;
            }

            // 서버로부터 문자 받기
            String received = input.readUTF();
        }
    }
}
