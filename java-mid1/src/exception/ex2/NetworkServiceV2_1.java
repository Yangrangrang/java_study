package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 clientV0 = new NetworkClientV2(address);
        clientV0.initError(data);   // 추가

        clientV0.connect();
        clientV0.send(data);
        clientV0.disconnect();
    }
}
