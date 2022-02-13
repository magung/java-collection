package collection;

import java.util.List;

import collection.data.Person;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Agung");
        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbues(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbues(List<String> hobbies) {
        hobbies.add("Bukan Hobby");
    }
    
}
