package lesson5_4;

import java.util.ArrayList;

public class StaticVars {
}

//class Initializers {
//    private static int counter = 0;
//}

//class Initializers {
//    private static final int NUM_BUCKETS = 45;
//
//    public static void main(String[] args) {
//        NUM_BUCKETS = 5;
//    }
//}

class Initializers {
    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        values.add("changed");
    }
}
