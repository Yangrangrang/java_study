package chat.server;

import java.io.IOException;

public class CommandManagerV1 implements CommandManager {

    private final SessionManager sessionManager;

    public CommandManagerV1(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }


    @Override
    public void execute(String totalMessages, Session session) throws IOException {

        if (totalMessages.equals("/exit")) {
            throw new IOException("exit");
        }

        sessionManager.sendAll(totalMessages);
    }
}
