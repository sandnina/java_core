package Lesson3;

//Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//Для хранения фруктов внутри коробки можно использовать ArrayList;

public class Box {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1f);
        Apple apple2 = new Apple(1.8f);
        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);

        MyBox<Apple> Box1 = new MyBox();
        MyBox<Apple> Box2 = new MyBox();
        MyBox<Orange> Box3 = new MyBox();
        MyBox<Orange> Box4 = new MyBox();
        Box1.add(apple1, apple2);
        Box2.add(apple1, apple2);
        Box3.add(orange1, orange2);
        Box4.add(orange1, orange2);

        System.out.println("Вес коробки №1 " + Box1.getWeight());
        System.out.println("Вес коробки №2 " + Box2.getWeight());
        System.out.println("Вес коробки №3 " + Box3.getWeight());
        System.out.println("Вес коробки №4 " + Box4.getWeight());
        boolean compare = Box1.compare(Box2);
        if (compare) {
            System.out.println("Вес коробок равный");
        }
        else System.out.println("Вес коробок разный");
        System.out.println("\nЕлементы коробки №1:");
        Box1.getElements();
        System.out.println("\nЕлементы коробки №2:");
        Box2.getElements();
        System.out.println("\nЗабираем элементы из коробки №2 в коробку №1");
        Box1.takeBox(Box3);
        System.out.println("\nЕлементы коробки №1:");
        Box1.getElements();
        System.out.println("\nЕлементы коробки №2:");
        Box2.getElements();
    }

}
