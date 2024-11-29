package extends1.overriding;

public class ElectricCar extends Car {

    @Override   // 상속받은 메서드를 재정의함 ( 메서드 오버라이딩)
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge() {
        System.out.println("충전합니다.");
    }
}
