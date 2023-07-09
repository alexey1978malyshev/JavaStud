package Seminar5;
/*Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String str1 = sc.nextLine();
        System.out.println("Введите строку 2: ");
        String str2 = sc.nextLine();
        System.out.println(checkIzomorphString(str1, str2));
        sc.close();

    }

    public static boolean checkIzomorphString(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (!(s1.length() == s2.length())) return false;
        else {
            Map<String, String> dict = new HashMap<>();
            String[] arr1 = s1.split("");
            String[] arr2 = s2.split("");

            for (int i = 0; i < s1.length(); i++) {
                if (!dict.containsKey(arr1[i])) {
                    dict.put(arr1[i], arr2[i]);
                } else {
                    if (!dict.get(arr1[i]).equals(arr2[i])) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
