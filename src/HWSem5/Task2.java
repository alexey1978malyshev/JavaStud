package HWSem5;
/* 📌 Пусть дан список сотрудников:Иван Иванов, Пётр Петров и др.
Написать программу, которая найдет и выведет повторяющиеся имена
с количеством повторений. Отсортировать по убыванию популярности*/

import com.sun.source.tree.Tree;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> employersList = new ArrayList<>();
        employersList.add("Кузьмин А.В.");
        employersList.add("Сергеев С.А.");
        employersList.add("Петров П.У.");
        employersList.add("Кузьмин А.В.");
        employersList.add("Петров П.У.");
        employersList.add("Кукушкина Ю.П.");
        employersList.add("Кузьмин А.В.");
        employersList.add("Сергеев С.А.");
        employersList.add("Кукушкина Ю.П.");
        employersList.add("Петров П.У.");
        employersList.add("Иванов И.А.");
        employersList.add("Кузнецов К.К.");
        employersList.add("Яковлев А.М.");
        employersList.add("Антонов А.П.");
        employersList.add("Кузьмин А.В.");
        employersList.add("Кукушкина Ю.П.");
        employersList.add("Кукушкина Ю.П.");
        employersList.add("Кукушкина Ю.П.");

        getAndDeleteMaxFromHashMap(counterOfInsertInLst(employersList));

    }
    private static void getAndDeleteMaxFromHashMap(Map<String, Integer> dict){
        while (!dict.isEmpty()) {
            Map.Entry<String, Integer> maxEntry = Collections.max(dict.entrySet(), Map.Entry.comparingByValue());
            System.out.println(maxEntry);
            dict.remove(maxEntry.getKey());
        }
    }
    private static Map<String, Integer> counterOfInsertInLst( ArrayList<String> lst){
        int counter = 1;
        Map<String, Integer> empValue = new HashMap<>();
        Collections.sort(lst);
        System.out.println(lst);
        String currEmployer = lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            String compareEmp = lst.get(i);
            if (currEmployer.equals(compareEmp)) {
                counter++;
            } else {
                if (counter > 1) empValue.put(lst.get(i - 1), counter);
                counter = 1;
                currEmployer = compareEmp;
            }
        }
        if (counter > 1) empValue.put(currEmployer, counter);
        return empValue;
    }
}
