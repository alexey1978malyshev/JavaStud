package HWSem3;
/*
    1.Реализовать алгоритм сортировки слиянием
    2.Пусть дан произвольный список целых чисел, удалить из него четные числа
    3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
*/

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] arrayNum = new Integer[]{6, 5, 2, 9, 21, 14, 33, 3, 8, 0};

        int strart = 0;
        int finish = arrayNum.length - 1;

        mergeSort(arrayNum, strart, finish);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.asList(arrayNum));

        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, arrayNum);
        System.out.println("Список целых чисел");
        System.out.println(list1);

        deleteEvenNum(list1);
        System.out.println("Список  нечетных целых чисел");
        System.out.println(list1);

        findMinMaxMedInList(list1);
    }

    private static void mergeSort(Integer[] array, int start, int finish) {
        if (finish <= start) {
            return;
        }
        int middle = start + (finish - start) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, finish);

        Integer[] changeArr = Arrays.copyOf(array, array.length);

        int i = start;
        int j = middle + 1;
        for (int k = start; k <= finish; k++) {
            if (i > middle) {
                array[k] = changeArr[j];
                j++;
            } else if (j > finish) {
                array[k] = changeArr[i];
                i++;
            } else if (changeArr[j] < changeArr[i]) {
                array[k] = changeArr[j];
                j++;
            } else {
                array[k] = changeArr[i];
                i++;
            }
        }
    }

    private static void deleteEvenNum(List<Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(i);
                i--;
            }
        }
    }

    private static void findMinMaxMedInList(List<Integer> lst){
        int min = 0;
        int max = 0;
        int med = 0;

        System.out.printf("Значение минимального элемента списка = %d ---",Collections.min(lst));
        System.out.printf("Значение максимального элемента списка = %d---",Collections.max(lst));
        int sumElem = lst.stream().reduce(Integer::sum).get();
        double mediumValue = (double)sumElem / lst.size();
        System.out.printf("Среднее арифметическое элементов списка = %f", (mediumValue));

    }
}
