package methodRef;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {

    public static void main(String[] args) {
        // 1. 정적 메서드 참조
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;

        System.out.println("staticMethod.get = " + staticMethod1.apply("hanna"));
        System.out.println("staticMethod2.get = " + staticMethod2.apply("hanna"));

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("hanna");
        Function<Integer, String> instanceMethod1 = n -> person.introduceWithNumber(n);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;

        System.out.println("instanceMethod1 = " + instanceMethod1.apply(1));
        System.out.println("instanceMethod2 = " + instanceMethod2.apply(2));

        // 3. 생성자 참조
        Function<String, Person> newPerson = name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;

        System.out.println("newPerson = " + newPerson.apply("hanna"));
        System.out.println("newPerson2 = " + newPerson2.apply("hanna"));
    }
}
