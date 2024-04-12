package org.example.ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit4 {
    String name;
    int weight;

    public Fruit4(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple4 extends Fruit4 {
    Apple4(String name, int weight) {
        super(name, weight);
    }
}

class Grape4 extends Fruit4 {
    Grape4(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple4> {

    public int compare(Apple4 t1, Apple4 t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape4> {
    public int compare(Grape4 t1, Grape4 t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit4> {
    public int compare(Fruit4 t1, Fruit4 t2) {
        return t1.weight - t2.weight;
    }
}

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox4<Apple4> apple4FruitBox4 = new FruitBox4<Apple4>();
        FruitBox4<Grape4> grape4FruitBox4 = new FruitBox4<Grape4>();

        apple4FruitBox4.add(new Apple4("GreenApple", 300));
        apple4FruitBox4.add(new Apple4("GreenApple", 100));
        apple4FruitBox4.add(new Apple4("GreenApple", 200));

        grape4FruitBox4.add(new Grape4("GreenGrape", 400));
        grape4FruitBox4.add(new Grape4("GreenGrape", 300));
        grape4FruitBox4.add(new Grape4("GreenGrape", 200));

        Collections.sort(apple4FruitBox4.getList(), new AppleComp());
        Collections.sort(grape4FruitBox4.getList(), new GrapeComp());

        System.out.println(apple4FruitBox4);    // [GreenApple(300), GreenApple(200), GreenApple(100)]
        System.out.println(grape4FruitBox4);    // [GreenGrape(400), GreenGrape(300), GreenGrape(200)]
        System.out.println();

        Collections.sort(apple4FruitBox4.getList(), new FruitComp());
        Collections.sort(grape4FruitBox4.getList(), new FruitComp());

        System.out.println(apple4FruitBox4);    // [GreenApple(100), GreenApple(200), GreenApple(300)]
        System.out.println(grape4FruitBox4);    // [GreenGrape(200), GreenGrape(300), GreenGrape(400)]
    }
}

class FruitBox4<T extends Fruit4> extends Box4<T> {}

class Box4<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
