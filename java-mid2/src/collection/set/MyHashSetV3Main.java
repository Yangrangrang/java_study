package collection.set;

public class MyHashSetV3Main {

    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set = " + set);

        // 검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        MySet<Integer> set2 = new MyHashSetV3<>(10);
        set2.add(1);
        set2.add(2);
        System.out.println("set2 = " + set2);
    }
}
