package HWSem1;
/*
1) Вычислить n-ое треугольное число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = sc.nextInt();
        int sum = sumTriangleNum(num);
        int mult = multTriangleNum(num);
        System.out.printf("Число номер %d в ряду сумм = %d", num, sum);
        System.out.println();
        System.out.printf("Число номер %d в ряду произведений = %d", num, mult);


        sc.close();
    }

    public static int sumTriangleNum(int n) {
        int sum = 0;
        if (n != 0) {
            //triangle[0] = 1;
            sum = sumTriangleNum(n - 1) + (n);
        } else {
            //Tn=Tn-1+n
            sum = 0;
        }
        return sum;
    }

    public static int multTriangleNum(int n) {
        int mult = 1;
        if (n != 0) {
            mult = multTriangleNum(n - 1) * (n);
        } else {
            //Tn=Tn-1+n
            mult = 1;
        }
        return mult;
    }

}
