package HWSem6;
/*Задание
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
    отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому
     критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<NoteBook>newSet;
        newSet=Store.fillNoteBookStore(15);
        filteredNotebooks(newSet);
    }
    public static void filteredNotebooks(Set<NoteBook>rawSet){

        Scanner sc = new Scanner(System.in);

            System.out.println("“Введите цифру, соответствующую необходимому критерию: \n" +
                    "1 - Брэнд\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Объем оперативной памяти\n" +
                    "4 - Операционная система \n" +
                    "5 - Цвет \n" +
                    "6 - Диагональ экрана");
        while (sc.hasNext()) {
            int chooseParam = sc.nextInt();
            sc.nextLine();

            System.out.println("Введите минимальные, либо желаемые значения: ");
            String paramValue = sc.next();

            for (NoteBook n :
                    rawSet) {
                switch (chooseParam) {
                    case 1 -> {
                        if (n.brand.contains(paramValue)) System.out.println(n);
                    }
                    case 2 -> {
                        if (n.hdd >= Integer.parseInt(paramValue)) System.out.println(n);
                    }
                    case 3 -> {
                        if (n.ram >= Integer.parseInt(paramValue)) System.out.println(n);
                    }
                    case 4 -> {
                        if (n.system.contains(paramValue)) System.out.println(n);
                    }
                    case 5 -> {
                        if (n.color.contains(paramValue)) System.out.println(n);
                    }
                    case 6 -> {
                        if (n.screen >= Double.parseDouble(paramValue)) System.out.println(n);
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + chooseParam);
                }
            }
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        }
        sc.close();
    }
}
