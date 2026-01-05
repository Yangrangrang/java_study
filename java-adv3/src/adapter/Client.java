package adapter;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.process("CARD", 10000);
        paymentProcessor.process("KAKAO", 10000);
        paymentProcessor.process("PG", 10000);

        paymentProcessor.adapterProcess("CARD", 10000);
        paymentProcessor.adapterProcess("KAKAO", 10000);
        paymentProcessor.adapterProcess("PG", 10000);
    }
}
