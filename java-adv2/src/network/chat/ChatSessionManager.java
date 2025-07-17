package network.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatSessionManager {

    private List<ChatSession> sessions = new ArrayList<>();

    public synchronized void add(ChatSession chatSession) {
        sessions.add(chatSession);
    }

    public synchronized void remove(ChatSession chatSession) {
        sessions.remove(chatSession);
    }

    public synchronized void closeAll() {
        for (ChatSession session : sessions) {
            session.close();
        }
        sessions.clear();
    }
}
