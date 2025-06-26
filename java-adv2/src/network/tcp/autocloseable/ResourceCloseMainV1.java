package network.tcp.autocloseable;

public class ResourceCloseMainV1 {

    public static void main(String[] args) {
        try {
            login();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");
            throw new RuntimeException(e);
        } catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            throw new RuntimeException(e);
        }
    }

    private static void login() throws CallException, CloseException {
        ResourceV1 resource1 = new ResourceV1("resourceV1");
        ResourceV1 resource2 = new ResourceV1("resourceV2");

        resource1.call();
        resource2.callEx(); // CallException

        System.out.println("자원 정리");    // 호출 안됨
        resource2.closeEx();
        resource1.close();

    }


}
