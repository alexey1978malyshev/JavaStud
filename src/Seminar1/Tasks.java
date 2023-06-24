package Seminar1;

//дан массив дв-ых чисел. Вывести макс. кол-во идущих подряд 1

public class Tasks {
    public static void main(String[] args) {
        //int[] arr = {1, 1, 0, 1, 1, 1, 0, 0, 0, 1,};

        //System.out.println(counterMaxInArray(arr));

//        int[] arr1 = {3, 3,3, 3,5,8,6,4,5,3,3,3,2,1,4,2,7,5,3,3,3};
//
//        for (int num : removeSameToEnd(arr1, 4)) {
//            System.out.printf("%d, ", num);
//        }
        String[] inputStrArr = {"flower", "flow", "floght"};
        System.out.println("+++ " + showLongPrefix(inputStrArr));
    }

    public static int counterMaxInArray(int[] array) {
        int count = 0;
        int countCurr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countCurr = 0;
                continue;
            }
            if (array[i] == 1) {
                countCurr++;
                if (countCurr > count) count = countCurr;
            }
        }
        return count;
    }

    public static int[] removeSameToEnd(int[] array, int n) { //убираем заданные элементы массива в конец
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] == n) {
                    array[i] = array[j];
                    array[j] = n;
                }
            }
        }
        return array;
    }


    public static String showLongPrefix(String[] str) {
        String newString = "";
        Character ch;
        int index = 0;
        while (true) {
            if(index==str[0].length()) return newString;
            ch = str[0].charAt(index);
            for (String s : str) {
                if (index == s.length())
                    return newString;
                if (ch != s.charAt(index))
                    return newString;
            }
            newString += ch;
            index++;
        }
            //return newString;
    }


}
