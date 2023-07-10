package HWSem5;

import java.nio.channels.SelectableChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*📌 Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
📌 Пусть дан список сотрудников:Иван Иванов, Пётр Петров и др.
Написать программу, которая найдет и выведет повторяющиеся имена
с количеством повторений. Отсортировать по убыванию популярности*/
public class Task1 {
    public static void main(String[] args) {

        System.out.println(phoneBookMaker());

//        Map<String, String> pB;
//        pB = phoneBookMaker();
//        System.out.println(pB.get("Иванов"));


    }

    private static Map<String, String> phoneBookMaker() {
        Map<String, String> phoneBook = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Начнем... нажмите любую клавишу, кроме q: ");

        while (!sc.nextLine().equals("q")) {
            System.out.println("Введите фамилию: ");
            String name = sc.nextLine();
            System.out.println("Введите номер телефона: ");
            String phoneNum = sc.nextLine();
            if (!phoneBook.containsKey(name)) phoneBook.put(name, phoneNum);
            else {
                String currentValue = phoneBook.get(name);
                phoneBook.put(name, phoneNum + "#" + currentValue);
            }
            System.out.println("Нажмите любую клавишу для продолжения ввода или q для выхода: ");
        }
        sc.close();
        return phoneBook;
    }
}
