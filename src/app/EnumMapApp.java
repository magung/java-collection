package app;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }
    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Agung");
        map.put(Level.VIP, "Maulana");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
