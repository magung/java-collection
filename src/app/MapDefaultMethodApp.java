package app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();

        map.putAll(Map.of(
            "agung", "Agung",
            "budi", "Budi",
            "joko", "Joko"
        ));

        map.forEach(new BiConsumer<String,String>() {

            @Override
            public void accept(String key, String value) {
                // TODO Auto-generated method stub
                System.out.println(key + " : " + value);
            }
            
        });

        
    }
}
