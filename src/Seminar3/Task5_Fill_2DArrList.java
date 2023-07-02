package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5_Fill_2DArrList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> bookTable = new ArrayList<>();
            ArrayList<String> genre1 = new ArrayList<>();
            ArrayList<String> genre2 = new ArrayList<>();
            ArrayList<String> genre3 = new ArrayList<>();
            genre1.add("Проза");
            genre1.add("12 стульев");
            genre1.add("Золотой теленок");
            genre1.add("Тарас Бульба");
            bookTable.add(genre1);

            genre2.add("Поэзия");
            genre2.add("Бородино");
            genre2.add("Евгений Онегин");
            genre2.add("Белая береза");
            bookTable.add(genre2);

            genre3.add("Детектив");
            genre3.add("ШерХолмс");
            genre3.add("Убийство в восточном экспрессе");
            bookTable.add(genre3);
        System.out.println(bookTable);
        for (int i = 0; i < bookTable.size() ; i++) {
            for (int j = 0; j < bookTable.get(i).size(); j++) {
                System.out.print(bookTable.get(i).get(j) + "  \t");

            }
            System.out.println();



        }

    }
}
