package app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {
        
        Set<String> names = new HashSet<>();
        names.add("Agung");
        names.add("agung");
        names.add("Maulana");
        names.add("Agung");
        for (var name : names) {
            System.out.println(name);
        }
        System.out.println("LinkedHashSet");
        Set<String> names2 = new LinkedHashSet(); // terurut
        names2.add("Agung");
        names2.add("agung");
        names2.add("Maulana");
        names2.add("Agung");
        for (var name : names2) {
            System.out.println(name);
        }

    }
    
}
