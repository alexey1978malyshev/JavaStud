package Seminar3;/*Заполнить список десятью случайными числами.
📌 Отсортировать список методом sort() и вывести его на
экран*/

import java.util.*;

public class Task1_AddRand_ToArr {
    public static void main(String[] args) {
        Integer n = 10;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(randNumAdd(n)));
        Collections.sort(list);
        System.out.println(list);
    }

    public static Integer[] randNumAdd(Integer n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }
}
