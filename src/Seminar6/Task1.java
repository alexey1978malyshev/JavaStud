package Seminar6;

import java.util.*;

/*1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.*/
public class Task1 {


    public static void main(String[] args) {
        int[]arr = fillArray(1000);
        //System.out.println(Arrays.toString(arr));
        System.out.println(getSetFromArray(arr));
    }
    private static int[] fillArray(int n){
        int[] resArr = new int[n];

        for (int i = 0; i < n; i++) {
            resArr[i] = (int)(Math.random()*24);
        }
        return resArr;
    }
    private static double getSetFromArray(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i :
                array) {
            set.add(i);
        }
        double unicPerc = set.size()*100/(double)array.length;
        return unicPerc;
    }

}
