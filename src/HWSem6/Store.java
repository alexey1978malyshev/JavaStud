package HWSem6;

import java.util.*;

public class Store {
    int setSize;

    public static Set<NoteBook> fillNoteBookStore(int setSize){
        Set<NoteBook> nbSet = new HashSet<>();

        for (int i = 0; i < setSize; i++) {
            NoteBook unit = new NoteBook();
            nbSet.add(unit);
            unit.brand = unit.brandNames[(int)(Math.random()*4)];
            unit.system = unit.systemNames[(int)(Math.random()*5)];
            unit.hdd = unit.hddValues[(int)(Math.random()*4)];
            unit.ram = unit.ramValues[(int)(Math.random()*4)];
            unit.imei = unit.imeiValues;
            unit.color = unit.colors[(int)(Math.random()*4)];
            unit.screen = unit.screens[(int)(Math.random()*5)];

        }
        System.out.printf("В магазине %d ноутбуков", nbSet.size());
        System.out.println();
        int num = 1;
        for (NoteBook n :
                nbSet) {
            System.out.println(num + ") " + n);
            num++;
        }
        return nbSet;
    }
}
