package Seminar4;

import java.util.Stack;

/*Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().*/


public class Task4_Stack {

    int[] array;
    int top;
    public Task4_Stack(int size){
        array = new int[size];
        top = -1;
    }
    public  int size(){
        return  top + 1;
    }
    public  boolean empty(){

        return  top == - 1;
    }
    public void push(int num){
        top++;
        array[top] = num;
    }
    public int peek() throws Exception {
        if (empty()){
            throw new Exception("Стэк пуст..");
        }
        return array[top];
    }
    public int pop() {
        if (empty()){
            throw new IllegalStateException("  ");
        }
        return array[top--];
    }

    public static void main(String[] args) {
        Task4_Stack st = new Task4_Stack(100);
//        st.push(1);
//        st.push(6);
//        st.push(2);
//        st.push(5);
//        st.push(0);
        System.out.println("Size: " + st.size());

        System.out.println("Pop:" + st.pop());

        System.out.println("Size: " + st.size());


    }
}
