package Seminar6;
/*1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
6, 3}. Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества*/

import java.util.*;

public class Task0 {
    public static void main(String[] args) {
        HashSet<Integer> set = getHashSet();
        System.out.println(set);
//        for (int i :
//                set) {
//            System.out.println(i);
//        }
        LinkedHashSet<Integer> set2 = getLHSet();
        System.out.println(set2);
        TreeSet<Integer> set3 = getTreeSet();
        System.out.println(set3);




    }
    public  static HashSet<Integer> getHashSet(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 5, 3, 6, 4, 8, 7, 9, 5, 4, 8, 5, 1, 2, 5, 4));
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(2);
//        set1.add(4);
//        set1.add(5);
//        set1.add(6);
//        set1.add(3);
//        set1.add(1);
        return set1;
    }
    public  static LinkedHashSet<Integer> getLHSet() {
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1, 2, 5, 3, 6, 4, 8, 7, 9, 5, 4, 8, 5, 1, 2, 5, 4));

        return set2;
    }
    public  static TreeSet<Integer> getTreeSet() {
        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1, 2, 5, 3, 6, 4, 8, 7, 9, 5, 4, 8, 5, 1, 2, 5, 4));

        return set3;
    }
}
