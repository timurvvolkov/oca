package lesson6_3.defoult.static_methods;

public class StaticMethods {
}

interface Hop {
    static int getJumpHeight() {
        return 8;
    }
}

class Bunny implements Hop {
    public void printDetails() {
        System.out.println(Hop.getJumpHeight());
    }
}
