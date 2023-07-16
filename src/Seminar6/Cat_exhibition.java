package Seminar6;

import java.util.HashSet;

public class Cat_exhibition {
    String name;//кличка
    String owner;//владелец
    int age;//возраст
    boolean gender;//пол
    String motherName;
    String fatherName;
    String[] achives; //награды


    public static void say() {  //что делает-мяукает
        System.out.println("Myao..");
    }
    public static String[] addAchives(String[] achives){
        String[] achives1 = new String[achives.length+1];
        return achives;
    }

}
