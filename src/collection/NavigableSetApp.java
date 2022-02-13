package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Agung", "Budi", "JOko", "Alif"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> budi = names.headSet("Budi", true);
        NavigableSet<String> budi2 = names.tailSet("Budi", true);
        for (var name : budi2) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        //immutable.add("Agung");//Error
    }
    
}
