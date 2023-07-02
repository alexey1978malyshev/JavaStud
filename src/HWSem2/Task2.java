package HWSem2;

import Seminar2.Task3_readFromDirectory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/
public class Task2 {
    static Logger logger = Logger.getLogger(Task2.class.getName());

    public static void main(String[] args) {
        int[] array = {23, 6, 3, 5, 9, 8, 8, 7, 5, 4, 8, 1};
        bubbleSort(array);
 //       StringBuilder sb = new StringBuilder();
        String s = Arrays.toString(array);
        System.out.println(s);

//        for (int i : array) {
//            System.out.print(i + " ");
//            sb.append(i + " ");
//        }
//        writeToFile(sb.toString());
    }

    public static void bubbleSort(int[] arr) {
        StringBuilder sbIter = new StringBuilder();
        int countIter = 0;
        try {
            FileHandler fh = new FileHandler("log.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.addHandler(fh);

        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                countIter++;
                for (int item : arr) {
                    sbIter.append(item + " ");
                }

                logger.log(Level.INFO, countIter + ":-- " + sbIter.toString());
                sbIter.setLength(0);
            }

        }

    }

    public static void writeToFile(String s) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(s);
        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }
}
