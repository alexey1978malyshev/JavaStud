package HWSem2;

import java.util.Scanner;

/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя
StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фильтр для поиска: 'ключ = значение'");
        String searchStr = sc.nextLine();
        System.out.println(reqToDb(searchStr));

    }
    public static String reqToDb(String str){
        String reqStr = "";
        if (!str.contains("null")){
            StringBuilder request = new StringBuilder("select * from students where " + str);
            reqStr = request.toString();
        }
        else System.out.println("Значение не должно быть null");
        return reqStr;
    }
}
