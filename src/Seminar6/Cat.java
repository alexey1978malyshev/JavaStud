package Seminar6;

import java.util.HashSet;

/*1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
*/
public class Cat {
    //for a:
    String name;//кличка
    String owner;//владелец
    int age;//возраст
    double mass;//вес
    double height;//рост
    boolean gender;//пол
    HashSet<String> disease;//болезни
    HashSet<String> vactinations;//прививки

    public static void say() {  //что делает-мяукает
        System.out.println("Myao..");
    }
    public static String getDisease(){
        String res = getDisease();
        return res;
    }
}

