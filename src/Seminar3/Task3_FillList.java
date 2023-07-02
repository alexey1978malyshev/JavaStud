package Seminar3;

import java.util.*;

/*📌 Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
📌 Вывести название каждой планеты и количество его
повторений в списке.
📌* Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.*/
public class Task3_FillList {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<>();
        planetList.add("Merkury");
        planetList.add("Venere");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Earth");
        planetList.add("Saturn");
        planetList.add("Merkury");
        planetList.add("Uran");
        planetList.add("Neptun");
        planetList.add("Pluton");
        planetList.add("Merkury");
        planetList.add("Jupiter");
        planetList.add("Jupiter");
        planetList.add("Mars");
        int counter = 1;
        StringBuilder out = new StringBuilder(" ");
        Collections.sort(planetList);
        String currPlanet = planetList.get(0);
        for (int i = 1; i < planetList.size(); i++) {
            String comparePlanet = planetList.get(i);
            if (currPlanet.equals(comparePlanet)) {

                counter++;
            }
            else {
                out.append(currPlanet).append("-").append(counter).append(" ");
                counter = 1;
                currPlanet = comparePlanet;
            }

        }
        out.append(currPlanet).append("-").append(counter).append(" ");
        System.out.println(out);
        System.out.println(planetList);
        deleteRepite(planetList);
        System.out.println(planetList);
    }
    public static void deleteRepite(ArrayList<String> arrLst){
        String planet = arrLst.get(0);

        for (int i = 1; i < arrLst.size(); i++) {
            String currElem = arrLst.get(i);
            if (planet.equals(currElem)){
                arrLst.remove(planet);
                i--;
            }
            else {
                planet = arrLst.get(i);
            }
        }
    }
}
