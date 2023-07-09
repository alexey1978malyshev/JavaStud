package Seminar5;
/*Написать программу, определяющую правильность расстановки скобок в
выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь*/

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task2_checkBrackets {
    public static void main(String[] args) {
        String inputStr = "<{a}+{(d*3)}>";
        System.out.println(checkBrackets(inputStr));

    }
    public static boolean checkBrackets(String s){
        Map<Character,Character> dict = new HashMap<>();
        dict.put(')','(');
        dict.put(']','[');
        dict.put('}','{');
        dict.put('>','<');

        Stack<Character> st = new Stack<>();

        for (Character ch:
        s.toCharArray()){
            if (dict.containsValue(ch)){
                st.push(ch);
            } else if (dict.containsKey(ch)) {
                if (st.isEmpty() || st.pop() != dict.get(ch)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
