package org.hillel.generics;

import java.util.*;

public class ArrayAndListUtils {
    public static void main(String[] args) {
        String[] nm = new String[10];
        nm[0] = "N";
        nm[1] = "f";
        nm[2] = "g";
        nm[3] = "h";
        nm[4] = "j";
        nm[5] = "k";
        nm[6] = "l";
        nm[7] = "u";
        nm[8] = "t";
        nm[9] = "M";
        System.out.println("Масиив до переворота: ");
        for (String arr : nm) {
            System.out.println(arr);
        }
        ArrayAndListUtils.exchangeNM(nm, 9, 0);
        System.out.println("массив после переворота: ");

        for (String mas : nm) {
            System.out.println(mas);
        }

        List myList = new ArrayList();
        myList.add(2342);
        myList.add(44);
        myList.add(1000000);
        myList.add(454);
        myList.add(5);
        myList.add(55);
        myList.add(235);
        myList.add(11);
        ArrayAndListUtils.maxListElement(myList);
    }


    public static <T> void exchangeNM(T[] array, int m, int n) {

        T temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }

    public static <T extends Comparable<T>> void maxListElement(List<T> list) {
        T tmp = null;
        boolean lifeCycle = true;
        int command1 = 0;
        int command2 = 0;
        Collection<T> Item = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        while (lifeCycle == true) {
            System.out.println("\nДиапазон поиска");
            System.out.println("Начальный индекс элемента поиска в коллекции: ");
            command1 = scan.nextInt();
            if (command1 > list.size()) {
                System.out.println("Введите индекс в диапазоне от 0 до " + list.size());
                continue;
            }
            System.out.println("Конечный индекс элемента поиска в коллекции: ");
            command2 = scan.nextInt();
            if (command2 > list.size()) {
                System.out.println("Введите индекс в диапазоне от " + command1 + " до " + list.size());
                continue;
            }
            lifeCycle = false;
        }
        for (T item : list.subList(command1, command2)) {
            if (tmp == null) tmp = item;
            Item.add(item);
        }
        System.out.println("\nелемент с максимальным значение коллекции :" + Collections.max(Item));
    }
}
