package org.hillel.generics;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnyObjectStore2 {

    private boolean lifeCycle = true;
    String command;

    public static void main(String[] args) {
        AnyObjectStore2 run = new AnyObjectStore2();
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        while (run.lifeCycle == true) {
            System.out.println("Choose your way:\n" +
                    "a - add element to list\n" +
                    "r - remove element from list\n" +
                    "s - show the list\n" +
                    "c - does the list contain the specified item?\n" +
                    "e - exit\n");
            run.command = input.nextLine();
            switch (run.command) {
                case ("a"):
                    System.out.println("enter any value which you want to add: ");
                    run.addToList(list, input.nextLine());
                    break;
                case ("r"):
                    System.out.println("enter any value which you want to remove: ");
                    run.removeFromList(list, input.nextLine());
                    break;
                case ("s"):
                    run.showTheList(list);
                    break;
                case ("c"):
                    System.out.println("enter the element which you want to check: ");
                    run.isContains(list, input.nextLine());
                    break;
                case ("e"):
                    run.lifeCycle = false;
                    break;
            }
        }
    }

    public static <T> void addToList(List<T> l, T e) {
        l.add(e);
    }

    public static <T> void removeFromList(List<T> l, T e) {
        if (l.contains(e)) {
            l.remove(e);
            System.out.println("removed element is: " + e);
        } else {
            System.out.println("item not found.");
        }
    }

    public static <T> void showTheList(List<T> l) {
        System.out.println("The element collection is: " + "\n");
        for (T text : l) {
            System.out.println(text);
        }
    }

    public static <T> boolean isContains(List<T> l, T e) {
        System.out.println(l.contains(e) + "");
        return false;
    }
}
