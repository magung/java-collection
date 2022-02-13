package app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, String> emptyMap = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Agung");
        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Agung");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Agung",
                "last", "Maulana");
        //map.put("a", "A");//ERROR
    }
}
