package lesson3_3;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] myArray = new String[3];
        myArray[0] = "Roger";
        myArray[1] = "Kevin";
        myArray[2] = "Lisa";

        for (String superName : myArray) {
            System.out.print(superName + ", ");
        }
    }
}
