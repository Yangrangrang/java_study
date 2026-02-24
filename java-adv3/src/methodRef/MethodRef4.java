package methodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRef4 {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("hanna"),
                new Person("yang"),
                new Person("na")
        );

        List<String> list1 = mapPersonToString(personList, p -> p.introduce());
        List<String> list2 = mapPersonToString(personList, Person::introduce);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        List<String> list3 = mapStringToString(list1, s -> s.toUpperCase());
        List<String> list4 = mapStringToString(list1, String::toUpperCase);
        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            result.add(fun.apply(person));
        }
        return result;
    }

    static List<String> mapStringToString(List<String> strings, Function<String, String> fun) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            result.add(fun.apply(s));
        }
        return result;
    }
}
