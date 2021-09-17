package lesson4_6;

import java.util.ArrayList;
import java.util.List;

public class CreatingArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>();
    }
}
