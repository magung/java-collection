package app;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }
    public static void main(String[] args) {
        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        // EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE);
        Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE);
        for (var gender : genders) {
            System.err.println(gender);
        }

        Gender[] values = Gender.values();
    }
    
}
