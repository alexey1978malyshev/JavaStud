package Seminar4;
/*📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task0_Compare_AL_LL_time_add {


    public static void main(String[] args) {
        int len = 100000;
        long getTimeAL = getArayListAddLast(len);
        long getTimeLL = getLinkedListAddLast(len);
        System.out.println("Время добавления в конец ArrayList - " + getTimeAL);
        System.out.println("Время добавления в конец LinkedList - " + getTimeLL);
        long getTimeALFirst = getArayListAddFirst(len);
        long getTimeLLFirst = getLinkedListAddFirst(len);
        System.out.println("Время добавления в начало ArrayList - " + getTimeALFirst);
        System.out.println("Время добавления в начало LinkedList - " + getTimeLLFirst);
        long getTimeALMid = getArayListAddMid(len);
        long getTimeLLMid = getLinkedListAddMid(len);
        System.out.println("Время добавления в середину ArrayList - " + getTimeALMid);
        System.out.println("Время добавления в середину LinkedList - " + getTimeLLMid);



    }

    private static long getArayListAddLast(int len) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListAddLast(int len) {
        List<Integer> linkList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            linkList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getArayListAddFirst(int len) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            arrayList.add(0, i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListAddFirst(int len) {
        List<Integer> linkList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            linkList.add(0, i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getArayListAddMid(int len) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            if (arrayList.size() > 10) {
                arrayList.add(10, i);
            }
            arrayList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListAddMid(int len) {
        List<Integer> linkList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            if (linkList.size() > 10) {
                linkList.add(10, i);
            }
            linkList.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }
}
