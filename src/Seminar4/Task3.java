package Seminar4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.*/
public class Task3 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 15, 777, 145, 18, 16, 12, 14};
        printStack(array);
        System.out.println();
        printQueue(array);

    }

    public static void printStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i :
                arr) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }

    public static void printQueue(int[] arr) {
        Queue<Integer> que = new LinkedList<>();
        for (int i :
                arr) {
            que.add(i);
        }
       while (!que.isEmpty()){
           System.out.print(que.poll() + " ");
       }
    }

}
