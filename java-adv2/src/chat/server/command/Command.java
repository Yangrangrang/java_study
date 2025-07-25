package chat.server.command;

import chat.server.Session;

import java.io.IOException;


// 디자인패턴 command 패턴
public interface Command {

    void execute(String[] args, Session session) throws IOException;
}
