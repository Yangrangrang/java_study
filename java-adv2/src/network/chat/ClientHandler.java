package network.chat;

import io.buffered.BufferedConst;

import java.io.*;
import java.net.Socket;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Set;

import static util.MyLogger.log;

public class ClientHandler extends Thread {

    private Socket socket;
    private Set<ClientHandler> clients;
    private PrintWriter out;
    private String userName = null;

    public ClientHandler(Socket socket, Set<ClientHandler> clients) {
        this.socket = socket;
        this.clients = clients;
    }

    @Override
    public void run() {

        try (DataInputStream in = new DataInputStream(socket.getInputStream())) {

            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("사용자 이름을 /join|{name} 형식으로 입력하세요.");

            while (true) {
                String message = in.readUTF();
                if (message == null) {
                    break;
                }

                if (message == null && message.startsWith("/join|")) {
                    userName = message.split("\\|", 2)[1];
                    System.out.println("userName = " + userName + "입장");
                }
            }

        } catch (IOException e) {
            log(e);
        } finally {
            clients.remove(this);
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
