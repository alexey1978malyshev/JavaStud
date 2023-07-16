package HWSem6;

import java.util.Random;

public class NoteBook {
    int hdd;
    int ram;
    String system;
    String color;
    double screen;
    String brand;
    int imei;
String[] brandNames = {"Sony","ASUS","Toshiba","Apple"};
int[] hddValues = {64,128,256,512};
int[] ramValues = {4,8,16,32};
String[] systemNames = {"Windows10", "Windows11","MacOS","Debian","KaliLinux"};
int imeiValues = (int)(Math.random()*123456);
String[] colors = {"белый", "черный","серебристый", "синий"};
double[] screens = {15,15.5,17.0,19.0,21.0};


   public NoteBook(){

    }
//    public NoteBook(String brand,String system,int hdd,int ram, String color, int imei){
//        this.brand = brand;
//        this.system = system;
//        this.hdd = hdd;
//        this.ram = ram;
//        this.imei = imeiValues;
//        this.color = color;
//    }
    @Override
    public String toString(){
       return "Модель: " + brand + ",\t объем ЖД: " + hdd + ",\t оперативная память: " + ram + ",\t " +
               "операционная система: " + system + ",\t цвет: " + color + ",\t диагональ экрана: " + screen + ",\t IMEI: " + imei;
    }
}
