package lesson4_6;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
//        List<Double> doubles = new ArrayList<>();
//        doubles.add(50.5);
//        doubles.add(new Double(60));
//        doubles.remove(50.5);
//        double first = doubles.get(0);
//        System.out.println(first);
//
//        List<Integer> integers = new ArrayList<>();
//        integers.add(null);
//        int h = integers.get(0);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
    }
}
