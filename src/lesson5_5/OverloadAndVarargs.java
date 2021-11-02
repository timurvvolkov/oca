package lesson5_5;

public class OverloadAndVarargs {

//    public static void fly(int[] lengths) {}
    public static void fly(int... lengths) {}
    public static void fly() {}

    public static void main(String[] args) {
        fly (new int[] {1, 2, 3});
        fly (1, 2, 3);
    }
}
