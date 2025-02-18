package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    /**
     * 장바구니 상품 출력
     * 상품명: 마늘 , 합계: 4000
     * 상품명: 상추, 합계: 12000
     * 전체 가격 합: 16000
     */
    public void displayItem() {
//        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
//            total += item.getTotalPrice();
        }   // 이렇게 해도 되는데 유지보수에 초점을 맞춘다면 목적에 따라 나누는 것이 좋음.

        System.out.println("전체 가격 합: " + caculateTotalPrice());

    }

    // 따로 메서드로 뺄수도 있음.
    private int caculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
