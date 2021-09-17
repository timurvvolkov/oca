package lesson4_6;

import java.util.ArrayList;

public class ArrayListInAction {
    public static void main(String[] args) {
        //add()
        ArrayList birds = new ArrayList();
        birds.add("Ворон");
        birds.add("Ворон");
        birds.add("Сорока");
        birds.add("Канарейка");

        System.out.println(birds);

//        ArrayList<String> generic = new ArrayList<>();
//        generic.add("Пётр");
//        generic.add(11);

        //remove()
//        birds.remove(0);
//        System.out.println(birds);
//        birds.remove("Сорока");
//        System.out.println(birds);

        //set()
//        birds.set(1, "Орел");
//        System.out.println(birds);

        //isEmpty() and size()
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("Василий");
//        arrayList.add(22);
//        System.out.println(arrayList.isEmpty());
//        System.out.println(arrayList.size());

        //clear()
//        birds.clear();
//        System.out.println(birds.isEmpty());
//        System.out.println(birds.size());

        //contains()
//        System.out.println(birds.contains("Попугай"));
//        birds.add("Попугай");
//        System.out.println(birds.contains("Попугай"));

        //equals()
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        System.out.println(arrayList1.equals(arrayList2));
        arrayList1.add("Евгений");
        System.out.println(arrayList1.equals(arrayList2));
        arrayList2.add("Евгений");
        System.out.println(arrayList1.equals(arrayList2));
    }
}
