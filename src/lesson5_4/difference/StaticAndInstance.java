package lesson5_4.difference;

public class StaticAndInstance {

    private String name = "Static class";

    public static void first() {}
    public static void second() {}

    public void third() {
        System.out.println(name);
        main(new String[0]);
    }

    public static void main(String[] args) {
        first();
        second();
//        third();
    }
}
