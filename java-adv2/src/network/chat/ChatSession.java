package network.chat;

import network.tcp.SocketCloseUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class ChatSession implements Runnable{

    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final ChatSessionManager sessionManager;
    private boolean closed = false;
    private String name;


    public ChatSession(Socket socket, ChatSessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {

        try {
            while (true) {
                String received = input.readUTF();
                log("client -> server: " + received);

                if (received.startsWith("/join|")) {
                    String[] parts = received.split("\\|", 2);
                    if (parts.length == 2) {
                        name = parts[1].trim();
                    }
                }

                if (received.startsWith("/message|")) {
                    String[] parts = received.split("\\|", 2);
                    String tosend = parts[1];
                    output.writeUTF(tosend);
                    log("[" + name + "]" + tosend);
                }

                if (received.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            close();
        }
    }

    // 세션 종료시, 서버 종료시 동시에 호출 될 수 있다.
    public synchronized void close() {
        if (closed) {
            return;
        }
        SocketCloseUtil.closeAll(socket, input, output);
        closed = true;
        log("연결 종료: " + socket);
    }
}
