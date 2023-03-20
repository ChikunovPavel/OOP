package seminar3;

import seminar3.drugs.Component;
import seminar3.drugs.impl.CatDrugs;
import seminar3.drugs.impl.componenet.Azitron;
import seminar3.drugs.impl.componenet.Pinicilin;
import seminar3.drugs.impl.componenet.Water;

import java.util.*;

public class Main  {

    public static void main(String[] args) {
        List <Component> catc = List.of(
                new Azitron("Aзтитрон","2",1),
                new Water("Вода","15",2),
                new Pinicilin("Таблетка", "20",3));
        List <Component> catc2 = List.of(
                new Azitron("Aзтитрон","6",4),
                new Water("Вода","30",5),
                new Pinicilin("Таблетка", "40",6));
        List <Component> catc3 = List.of(
                new Azitron("Aзтитрон","4",15),
                new Water("Вода","60",15),
                new Pinicilin("Таблетка", "10",15));
        List <Component> catc4 = List.of(
                new Azitron("Aзтитрон","4",15),
                new Water("Вода","60",15),
                new Pinicilin("Таблетка", "10",15));

        CatDrugs catd = new CatDrugs(catc,"catd");
        CatDrugs catd2 = new CatDrugs(catc2,"catd2");
        CatDrugs catd3 = new CatDrugs(catc3,"catd3");
        CatDrugs catd4 = new CatDrugs(catc4,"catd4");

        ArrayList<CatDrugs> ambulance = new ArrayList<>(List.of(catd, catd2, catd3, catd4));

        Collections.sort(ambulance);
        System.out.println("ambulance");
        for (CatDrugs item: ambulance) {
            System.out.println(item);

        }

        System.out.println("Component catc: ");
        System.out.println(catc);
        System.out.println("Hashcodes catc: ");
        for (CatDrugs component: ambulance) {
            System.out.println(component.hashCode());
        }

        Set<Component> result = new HashSet<>(catc);
        System.out.println("уникальный список : ");
        System.out.println(result);
        for (Component res: result) {
            System.out.println(res.hashCode());
        }
    }
}







