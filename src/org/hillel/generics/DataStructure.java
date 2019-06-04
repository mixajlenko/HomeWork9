package org.hillel.generics;


public class DataStructure<T> {

    private final static int SIZE = 15;

    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {

        //заполнение массива числами от 0 до 15

        for (int i = 0; i < SIZE; i++) {

            arrayOfInts[i] = i;

        }
    }

    public void printArray() {

        DataStructureIterator iterator = this.getObjectEvenIterator();
        System.out.print("Array elements is: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }


    public DataStructureIterator getObjectEvenIterator(){ // методо для возврата обьекта класс EvenIterator.
        return new EvenIterator();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    private class EvenIterator implements DataStructureIterator {

        private int nextIndex; //стартовая точка перебора.

        public boolean hasNext() {

            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            Integer getValue = arrayOfInts[nextIndex];
            nextIndex ++;
            return getValue;
        }

    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printArray();
    }
}
