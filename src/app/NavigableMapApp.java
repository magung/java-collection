package app;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("Agung", "Agung");
        navigableMap.put("Joko", "Joko");
        navigableMap.put("Budi", "Budi");

        for (var key : navigableMap.keySet()) {
            System.out.println(key);
        }

        System.out.println(navigableMap.lowerKey("Agung"));
        System.out.println(navigableMap.higherKey("Agung"));
        System.out.println(navigableMap.floorKey("Budi"));
        System.out.println(navigableMap.ceilingKey("Budi"));

        NavigableMap<String, String> mapDesc = navigableMap.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        // immutable
        NavigableMap<String, String> emptyNavigableMap = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutableNavigableMap = Collections.unmodifiableNavigableMap(mapDesc);

        //immutableNavigableMap.put("agung", "agung");//ERROR
    }
}
