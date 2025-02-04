package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("야옹1", 200);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류

        // 문제2: 개 타입 반환, 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
