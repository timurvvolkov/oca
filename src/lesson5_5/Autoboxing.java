package lesson5_5;

public class Autoboxing {

    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(Integer numMiles) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        Autoboxing autoboxing = new Autoboxing();
        autoboxing.fly(new Integer(1));
    }
}
