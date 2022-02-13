package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static <T> void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        numbers.replaceAll(new UnaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t) {
                // TODO Auto-generated method stub
                return t * 10;
            }
            
        });

        System.out.println(numbers);

        numbers.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                // TODO Auto-generated method stub
                System.out.println(t);
            }
            
        });

        numbers.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                // TODO Auto-generated method stub
                return t > 500;
            }
            
        });

        System.out.println(numbers);
    }
}
