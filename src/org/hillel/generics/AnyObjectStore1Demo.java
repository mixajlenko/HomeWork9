package org.hillel.generics;


import java.util.*;

public class AnyObjectStore1Demo {
    public static void main(String[] args) {
        AnyObjectStore1Demo run = new AnyObjectStore1Demo();
        run.task1();
    }

    public void task1() {

        AnyObjectStore1<Integer> obj1 = new AnyObjectStore1<Integer>(1, "Oleg");
        AnyObjectStore1<String> obj2 = new AnyObjectStore1<String>("ten", "Dima");
        AnyObjectStore1<Double> obj3 = new AnyObjectStore1<Double>(22.33, "Vasya");

        LinkedHashSet<AnyObjectStore1> mySetNew = new LinkedHashSet<AnyObjectStore1>();

        mySetNew.add(obj1);
        mySetNew.add(obj2);
        mySetNew.add(obj3);


        System.out.println("Коллекция после добавления обьектов\n" + mySetNew);

        mySetNew.clear();

        if (mySetNew.isEmpty()) {
            System.out.println("Коллекция после удаления обьектов пуста: " + mySetNew);
        } else {
            System.out.println("В коллекции все еще содержатся елементы: " + mySetNew);
        }
    }
}
