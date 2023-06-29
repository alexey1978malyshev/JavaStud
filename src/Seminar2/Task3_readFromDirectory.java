package Seminar2;
/*      Напишите метод, который вернет содержимое текущей папки в виде
        массива строк.
        📌 Напишите метод, который запишет массив, возвращенный предыдущим
        методом в файл.
        📌 Обработайте ошибки с помощью try-catch конструкции. В случае
        возникновения исключения, оно должно записаться в лог-файл.*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task3_readFromDirectory {
    static Logger logger = Logger.getLogger(Task3_readFromDirectory.class.getName());
    public static void main(String[] args) {

        String dirPath = "C:/Users/A9219/Documents/Py_Code";
        try {
            FileHandler fh = new FileHandler("log.txt");
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.addHandler(fh);
            logger.log(Level.WARNING,"log.txt");

        } catch (Exception e) {

            logger.log(Level.WARNING,e.getMessage());
        }
        File file = new File(".");
        String[] containDirect = getDirContain(dirPath);
        writeToFile(containDirect);



    }
    public static String[] getDirContain(String path){
        File file = new File(path);
        String[] dirContain = file.list();
        return dirContain;
    }

    public static void writeToFile(String[] s) {
        for (String value : s) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
                for (String st: s
                     ) {
                    writer.write(st+ "\n ");
                }

            } catch (IOException e) {

                System.out.println("Ошибка записи в журнал " + e.getMessage());

            }

        }

    }

}
