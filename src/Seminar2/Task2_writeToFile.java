package Seminar2;
/*Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2_writeToFile {
    public static void main(String[] args) {
        int n = 10;
        String text = "TEST ";
        String toWrite = repeatString(text, n);

        writweToFile(toWrite);
    }

    public static void writweToFile(String s) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(s);
        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }

    public static String repeatString(String s, int n) {
        s = s.repeat(n);
        return s;
    }

}
