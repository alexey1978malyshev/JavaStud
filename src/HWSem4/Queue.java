package HWSem4;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя.*/
public class Queue {
    java.util.Queue<Integer> lnkLst;

    public Queue() {
        lnkLst = new LinkedList<>();
    }

    public void enqueue(int num) {
        lnkLst.offer(num);
    }

    public int dequeue() {

        return lnkLst.remove();
    }

    public int first() {
        return lnkLst.element();
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        for (int i :
                q.lnkLst) {
            System.out.print(i);
        }
        q.dequeue();
        System.out.println();
        System.out.println(q.first());





    }
}
