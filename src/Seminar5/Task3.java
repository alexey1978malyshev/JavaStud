package Seminar5;

import java.util.HashMap;
import java.util.Map;

/*Написать метод, который переведет число из римского формата
записи в арабский.
Например, MMXXII = 2022*/
public class Task3 {
    public static void main(String[] args) {
        String strRome = "MMXXII";
        System.out.println("MMXXII=" + translateFromRomeToArabic(strRome));
    }
    private static Map<Character,Integer> dictFromRomeToArabic(){

        Map<Character,Integer> dict = new HashMap<>();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M',1000);
        return dict;
    }
    private static Integer translateFromRomeToArabic(String s){
        int res = 0;
        Map<Character,Integer> d = dictFromRomeToArabic();

        for (Character ch :
                s.toCharArray()) {
            if (d.containsKey(ch)){
                res+=d.get(ch);
            }
        }
        return res;
    }
}
