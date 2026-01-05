package adapter;

public class CardPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("카드 결제: " + amount + "원");
    }
}
