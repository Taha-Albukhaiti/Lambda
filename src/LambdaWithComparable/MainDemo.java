package LambdaWithComparable;

import java.util.Arrays;
import java.util.List;

public class MainDemo {


    public static void main(String[] args) {
        System.out.println();

        System.out.println();
        Roboter[] arrayliste = {
                new Roboter("R2D2", 40),
                new Roboter("C3PO", 30),
                new Roboter("Nummer 5", 10),
                new Roboter("Dotty Matrix", 20)
        };

        Arrays.sort(arrayliste, (o1, o2) -> o1.compareTo(o2));
        System.out.println(Arrays.toString(arrayliste));
        Arrays.sort(arrayliste, ((o1, o2) -> o1.getEnergie() - o2.getEnergie()));
        System.out.println("adadadad  "  +Arrays.toString(arrayliste));

        List<Roboter> l = Arrays.asList(new Roboter("R2D2", 40),
                new Roboter("C3PO", 30),
                new Roboter("Nummer 5", 10),
                new Roboter("Dotty Matrix", 20));
        l.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(l.get(0) + " " + l.get(1));
        l.sort(((o1, o2) -> o1.getEnergie() - o2.getEnergie()));
        System.out.println(l.get(0) + " " + l.get(1));
    }
}
