package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String string = list.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> list2 = new MyLinkedListV3<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Integer integer = list2.get(0);
        System.out.println("integer = " + integer);
        list2.set(1, 4);
        System.out.println(list2);
    }
}
