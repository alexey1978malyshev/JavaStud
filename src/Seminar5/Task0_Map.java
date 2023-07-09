package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*📌 Создать структуру для хранения Номеров паспортов и Фамилий
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
📌 Вывести данные по сотрудникам с фамилией Иванов.*/
public class Task0_Map {
    public static void main(String[] args) {
        Map<String, String> employers = new HashMap<>();
        employers.put("123456", "Иванов");
        employers.put("321456", "Васильев");
        employers.put("234561", "Петрова");
        employers.put("234432", "Иванов");
        employers.put("654321", "Петрова");
        employers.put("345678", "Иванов");
        for (var item :
                employers.entrySet()) {
            if (item.getValue().equals("Иванов"))
                System.out.println(item);
        }
    }
}
