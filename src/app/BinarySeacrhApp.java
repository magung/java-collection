package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySeacrhApp {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        int index = Collections.binarySearch(list, 333);
        System.out.println(index);
        System.out.println(list.get(index));

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o2.compareTo(o1);
            }
            
        };

        Collections.sort(list, comparator);
        int index2 = Collections.binarySearch(list, 333, comparator);
        System.out.println(index2);
        System.out.println(list.get(index2));
    }
}
