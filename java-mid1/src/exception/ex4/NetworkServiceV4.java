package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 clientV0 = new NetworkClientV4(address);
        clientV0.initError(data);   // 추가

        try {
            clientV0.connect();
            clientV0.send(data);
        } finally {
            clientV0.disconnect();
        }

    }
}
