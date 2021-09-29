package lesson4_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingToArray {
    public static void main(String[] args) {
//        List<String> birds = new ArrayList<>();
//        birds.add("Орел");
//        birds.add("Ястреб");
//
//        Object[] objectArray = birds.toArray();
//        System.out.println(objectArray.length);
//
//        String[] stringArray = birds.toArray(new String[0]);
//        System.out.println(stringArray.length);

        String[] array = {"Орел", "Ястреб"};
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());

        list.set(1, "Проверка");
        array[0] = "Новый";
        for (String b : array) {
            System.out.print(b + " ");
        }
//        list.remove(1);
    }
}
