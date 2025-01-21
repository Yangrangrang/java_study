package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 clientV0 = new NetworkClientV1(address);
        clientV0.initError(data);   // 추가

        clientV0.connect();
        clientV0.send(data);
        clientV0.disconnect();
    }
}
