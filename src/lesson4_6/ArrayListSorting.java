package lesson4_6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(57);
        arrayList.add(23);
        arrayList.add(-168);
        arrayList.add(98);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
