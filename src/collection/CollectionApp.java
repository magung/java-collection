package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Agung");
        collection.add("Maulana");
        collection.add("Budi");
        collection.add("Joko");
        collection.addAll(List.of("Menjadi", "Programmer"));

        for(var value: collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");
        collection.remove("Agung");
        collection.removeAll(List.of("Maulana", "Menjadi"));

        for(var value: collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Programmer"));
        System.out.println(collection.containsAll(List.of("Budi", "Joko")));

    }
    
}
