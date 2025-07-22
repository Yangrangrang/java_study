package chat.server;

import java.io.IOException;

public interface CommandManager {
    void execute(String totalMessages, Session session) throws IOException;
}
