package HWSem1;

/*
2) Вывести все простые числа от 1 до 1000

*/

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1000) {
            boolean flag = true;
            int j = 3;
            while (j <= i/2) {
                if (i % j == 0) {
                    flag = false;
                }
                j++;
            }
            if (flag) System.out.println(i);
            i++;

        }
    }


}
