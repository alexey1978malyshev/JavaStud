package Seminar2;

public class Task1_Palindrom {
    public static void main(String[] args) {
        String str = "abcbk";
        System.out.println(chekPalindrom(str));
    }
    public static boolean chekPalindrom(String s){
        boolean flag = true;
        s = s.toLowerCase();
        StringBuilder resStr = new StringBuilder(s);
        resStr.reverse();
        if(!s.equals(resStr.toString())) flag = false;
        return flag;
    }
}
