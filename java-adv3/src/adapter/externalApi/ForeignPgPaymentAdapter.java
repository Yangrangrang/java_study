package adapter.externalApi;

import adapter.PaymentService;

// adapter 생성
public class ForeignPgPaymentAdapter implements PaymentService {

    private final ForeignPgPayment pgPayment;

    public ForeignPgPaymentAdapter(ForeignPgPayment pgPayment) {
        this.pgPayment = pgPayment;
    }

    @Override
    public void pay(int amount) {
        double krw = amount;
        pgPayment.execute(krw, "KRW");
    }
}
