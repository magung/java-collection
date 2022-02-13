package app;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Agung");
        list.add("Maulana");
        list.add("Budi");
        list.add("Joko");

        for (var value : list) {
            System.out.println(value);
        }

    }

}
