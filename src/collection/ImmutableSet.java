package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSet {

    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Agung");

        Set<String> mutable = new HashSet<>();
        mutable.add("Agung");
        mutable.add("Maulana");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Agung", "Maulana");
        //set.add("MMM");//ERROR
        //set.remove("Agung"); // ERROR
    }
    
}
