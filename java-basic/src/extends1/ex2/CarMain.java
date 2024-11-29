package extends1.ex2;

public class CarMain {

    /*
    상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성
    상속 관계의 객체를 호출 할 때, 대상 타입을 정해야함. 이때 호출자의 타입을 통해 대상 타입을 찾음
    현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행. 찾지 못하면 컴파일 오류 발생
     */
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
