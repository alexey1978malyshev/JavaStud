package Seminar4;
/*Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        System.out.println(addElemByNum());

    }

    public static LinkedList<String> addElemByNum() {
        LinkedList<String> strLinkList = new LinkedList<>();
        String inpStr = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку вида string~num");
        inpStr = sc.nextLine();
        while (!inpStr.equals("exit")) {
            int num = inpStr.indexOf('~');
            String[] strArr = inpStr.split("~");
            int pos = Integer.parseInt(strArr[1]);
            if (pos > strLinkList.size()) {
                System.out.println("Введена неправильная позиция");

            } else if (strArr[0].equals("print")) {
                System.out.println(strLinkList.get(pos));
                strLinkList.remove(pos);
                System.out.println(strLinkList.size());
            } else {
                strLinkList.add(pos, strArr[0]);
                System.out.println(strLinkList.size());
            }

            inpStr = sc.nextLine();

        }
        sc.close();
        return strLinkList;
    }
}
