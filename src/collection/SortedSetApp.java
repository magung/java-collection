package collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import collection.data.Person;
import collection.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        // SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Agung"));
        people.add(new Person("Maulana"));
        people.add(new Person("Joko"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // immutable sortedset
        SortedSet<Person> unmodifiableSortedSet = Collections.unmodifiableSortedSet(people);
        // unmodifiableSortedSet.add(new Person("Budi"));
    }
    
}
