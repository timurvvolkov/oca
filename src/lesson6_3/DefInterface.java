package lesson6_3;

public class DefInterface {
}

interface WalksOnTwoLegs {}

class TestClass {
    public static void main(String[] args) {
//        WalksOnTwoLegs example = new WalksOnTwoLegs();
    }
}

//final interface WalksOnEightLegs {}

interface CanFly1 {
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}

abstract interface CanFly2 {
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();
}


//private final interface CanCrawl {
//    private void dig(int depth);
//    protected abstract double depth();
//    public final void surface();
//}
