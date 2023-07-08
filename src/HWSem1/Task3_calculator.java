package HWSem1;

import java.util.Scanner;
import java.util.Stack;


/* 3) Реализовать простой калькулятор
4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.*/
public class Task3_calculator {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Stack<String>stackLog = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример: сложение, вычитание, умножение и целочисленное деление, " +
                "а также возведение в степень))...  # - если хотите удалить последнее действие");
        while (sc.hasNext()) {
            String move = sc.nextLine();
            int operatorIdx = 0;
            char operator = '+';
            double result = 0;

            if (move.contains("+")) operatorIdx = move.lastIndexOf("+");
            else if (move.contains("-")) operatorIdx = move.lastIndexOf("-");
            else if (move.contains("*")) operatorIdx = move.lastIndexOf("*");
            else if (move.contains("/")) operatorIdx = move.lastIndexOf("/");
            else if (move.contains("^")) operatorIdx = move.lastIndexOf("^");
            else if (move.contains("#")) {
                removeFromStack(stackLog);
                continue;
            }
            else if (move.contains("show")) {
                showStack(stackLog);
                continue;
            } else {
                System.out.println("Выберите другое действие..");
                continue;
            }

            operator = move.charAt(operatorIdx);

            double firstPart = Double.parseDouble(move.substring(0, operatorIdx));
            double secondPart = Double.parseDouble(move.substring(operatorIdx + 1));

            switch (operator) {
                case ('+') -> result = firstPart + secondPart;
                case ('-') -> result = firstPart - secondPart;
                case ('*') -> result = firstPart * secondPart;
                case ('/') -> result = firstPart / secondPart;
                case ('^') -> result = Math.pow(firstPart, secondPart);
            }
            System.out.println();

            String resStr = move + "=" + result;

            stackLog.add(resStr);

            System.out.println(resStr);

            System.out.println("Введите следующий пример:  ");

        }
        sc.close();
    }

//    public static Stack<String> addArrLstLog(String str){
//        Stack<String>stackLog = new Stack<>();
//        stackLog.add(str);
//        return  stackLog;
//    }

    public static void removeFromStack(Stack<String>stackLog){
        stackLog.pop();
        for (String s :
                stackLog) {
            System.out.println(s);
        }

    }
    public static void showStack(Stack<String>stackLog){
        for (String s :
                stackLog) {
            System.out.println(s);
        }
    }



}
