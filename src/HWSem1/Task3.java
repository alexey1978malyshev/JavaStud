package HWSem1;

import java.util.Scanner;


/* 3) Реализовать простой калькулятор
4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.*/
public class Task3 {
    public static void main(String[] args) {
        calculator();

    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример: сложение, вычитание, умножение и целочисленное деление, а также возведение в степень))...  ");
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
            else {
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

            System.out.println(result);

            System.out.println("Введите следующий пример:  ");

        }
        sc.close();
    }


}
