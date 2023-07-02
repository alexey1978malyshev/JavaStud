package Seminar3;
/*📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа.
📌 Пройти по списку, найти и удалить целые числа.*/
import java.util.*;

public class Task4_Delete_NumFromList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("qwerty");
        list.add("eeee");
        list.add("33");
        list.add("36");

        list.add("ffff");
        list.add("345");

        removeDigits(list);
        System.out.println(list);
    }
    public static void removeDigits(List<String> lstInput){
        for (int i = 0; i < lstInput.size(); i++) {
            if (checkNum(lstInput.get(i))){
                lstInput.remove(lstInput.get(i));
                i--;
            }
        }
    }
    public static boolean checkNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
