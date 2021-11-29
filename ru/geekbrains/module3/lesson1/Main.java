package ru.geekbrains.module3.lesson1;

import com.sun.jdi.ArrayType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"1","2","3"};
        int[] ints= {1,2,3};

        swapElement(strings, 0, 2);
        System.out.println(Arrays.toString(strings));

        List newList = arrayToArrayList(strings);
        System.out.println(newList);

//        newList.add(new ArrayList<>());
//        System.out.println(newList);
    }

    public static <E> E[] swapElement(E[] array, int firstIndex, int secondIndex){
        if (firstIndex < 0) firstIndex = 0;
        if (secondIndex > array.length - 1) secondIndex = array.length - 1;
        E swapElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = swapElement;
        return array;
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
