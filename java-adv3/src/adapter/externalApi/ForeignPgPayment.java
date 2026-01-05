package adapter.externalApi;

// 외부 라이브러리 (우리가 수정 불가)
public class ForeignPgPayment {
    public boolean execute(double usdAmount, String currency) {
        System.out.println("PG 결제: " + usdAmount + " " + currency);
        return true;
    }
}

/**
 * 문제점
 * 메서드 이름 다름
 * 금액 타입 다름
 * 통화 개념 추가됨(currency)
 * 인터페이스 구현 불가
 */
