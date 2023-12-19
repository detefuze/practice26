package ru.mirea.kabo0222.task2;

import java.util.Iterator;

public class MyList<T> implements Iterable<T>{
    private final T[] array;
    private final int size;
    private int currentIndex = 0;

    public MyList(T[] array)
    {
        this.array = array;
        size = array.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }
            @Override
            public T next() {
                return array[currentIndex++];
            }
        };
    }

    public static void main(String[] args) {
        MyList lst = new MyList(new Integer[]{1,2,3,4});
        while (lst.iterator().hasNext()) System.out.println(lst.iterator().next());
    }
}
