package Seminar1;


import java.util.Calendar;
import java.util.Scanner;

public class ReqName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.println("Input your name: ");
        String name = sc.nextLine();
        //System.out.printf("Hello, %s", name);
        sc.close();
        helloName(name);


    }

    public static void helloName(String n) {

        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        String str ;
        if (hour >= 5 && hour < 12) {
            str = "morning";
        }
        else if (hour >= 12 && hour < 18) {
            str = "day";
        }
        else if (hour >= 18 && hour < 23) {
            str = "evening";
        }
        else {
            str = "night";
        }
        System.out.printf("Good %s, %s", str,n);
        System.out.println();
        System.out.printf("It`s %d o`clock now..", hour);

    }

}
