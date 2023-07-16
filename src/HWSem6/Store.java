package HWSem6;

import java.util.*;

public class Store {
    int setSize;

    public static Set<NoteBook> fillNoteBookStore(int setSize){
        Set<NoteBook> nbSet = new HashSet<>();

        for (int i = 0; i < setSize; i++) {
            NoteBook unit = new NoteBook();
            nbSet.add(unit);
            unit.brand = unit.brandNames[(int)(Math.random()*unit.brandNames.length)];
            unit.system = unit.systemNames[(int)(Math.random()*unit.systemNames.length)];
            unit.hdd = unit.hddValues[(int)(Math.random()*unit.hddValues.length)];
            unit.ram = unit.ramValues[(int)(Math.random()*unit.ramValues.length)];
            unit.imei = unit.imeiValues;
            unit.color = unit.colors[(int)(Math.random()*unit.colors.length)];
            unit.screen = unit.screens[(int)(Math.random()*unit.screens.length)];

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
