package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 clientV0 = new NetworkClientV2(address);
        clientV0.initError(data);   // 추가


        try {
            clientV0.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }

        try {
            clientV0.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }

        clientV0.disconnect();
    }
}
