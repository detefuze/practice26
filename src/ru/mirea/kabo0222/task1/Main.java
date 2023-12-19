package ru.mirea.kabo0222.task1;
import java.util.*;
public class Main {
    private final Stack<Integer> stack = new Stack<>();
    public int[] reverse(int[] array)
    {
        for (int element : array) stack.push(element);
        for (int i = 0; i < array.length; i++)
        {
            array[i] = stack.pop();
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().reverse(new int[]{1,2,3,4,5,6})));
    }
}
