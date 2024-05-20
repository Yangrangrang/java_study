package org.example.ch12;

class Fruit2 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class Toy2 {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {}
public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
        FruitBox<Apple2> appleFruitBox = new FruitBox<Apple2>();
        FruitBox<Grape2> grape2FruitBox = new FruitBox<Grape2>();
//        FruitBox<Grape2> grape2FruitBox1 = new FruitBox<Apple2>();  // ERR. 타입 불일치
//        FruitBox<Toy2> toy2FruitBox = new FruitBox<Toy2>(); // ERR.

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleFruitBox.add(new Apple2());
//        appleFruitBox.add(new Grape2());    // ERR.  Grape는 Apple의 자손이 아님
        grape2FruitBox.add(new Grape2());

        System.out.println("fruitBox = " + fruitBox);               // fruitBox = [Fruit, Apple, Grape]
        System.out.println("appleFruitBox = " + appleFruitBox);     // appleFruitBox = [Apple]
        System.out.println("grape2FruitBox = " + grape2FruitBox);   // grape2FruitBox = [Grape]
    }
}

class FruitBox<T extends Fruit2 & Eatable> extends Box<T> {
}