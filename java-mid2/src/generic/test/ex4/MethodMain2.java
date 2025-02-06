package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍", 100);
        Cat cat = new Cat("야옹", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
