package lesson5_5;

public class AutoboxingPrim {

    public void fly(int i) {
        System.out.print("int ");
    }

    public void fly(long l) {
        System.out.print("long ");
    }

    public static void main(String[] args) {
        AutoboxingPrim autoboxingPrim = new AutoboxingPrim();
        autoboxingPrim.fly(123);
        autoboxingPrim.fly(123L);
    }
}
