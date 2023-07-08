package HWSem4;
/*1) ПуПусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
 “перевернутый” список.*/

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> lnkLst = new LinkedList<>();
        int sizeLnkList = 10;
        for (int i = 0; i < sizeLnkList; i++) {
            lnkLst.add((int) (Math.random()*100));
        }
        System.out.println(lnkLst);
        System.out.println(reverseLnkList(lnkLst));

    }
    public static LinkedList<Integer> reverseLnkList(LinkedList<Integer> linkedList){
        LinkedList<Integer> reverseLnkLst = new LinkedList<>();
        for (int i = linkedList.size()-1; i >=0; i--) {
            reverseLnkLst.add(linkedList.get(i));
        }
        return reverseLnkLst;
    }



}
