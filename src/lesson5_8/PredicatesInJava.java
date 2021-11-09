package lesson5_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesInJava {

    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);

        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);
    }

    private void test(Predicate<Animal> predicate) {

    }
}
