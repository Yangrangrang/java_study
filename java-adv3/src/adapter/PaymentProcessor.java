package adapter;

import adapter.externalApi.ForeignPgPayment;
import adapter.externalApi.ForeignPgPaymentAdapter;

import java.util.Map;


public class PaymentProcessor {

    // adapter 가 없을 경우.
    public void process(String type, int amount) {
        if (type.equals("CARD")) {
            new CardPaymentService().pay(amount);
        } else if (type.equals("KAKAO")) {
            new KakaoPayService().pay(amount);
        } else if (type.equals("PG")) {
            ForeignPgPayment pg = new ForeignPgPayment();
            pg.execute(amount, "KRW");
        }
    }
    /**
     * 결제 수단 추가할 때마다 수정
     * if-else 많아짐.
     */

    // adapter 가 있을 경우.
    private final Map<String, PaymentService> paymentMap;

    public PaymentProcessor() {
        paymentMap = Map.of(
                "CARD", new CardPaymentService(),
                "KAKAO", new KakaoPayService(),
                "PG", new ForeignPgPaymentAdapter(new ForeignPgPayment())
        );
    }

    public void adapterProcess(String type, int amount) {
        paymentMap.get(type).pay(amount);
    }
}

