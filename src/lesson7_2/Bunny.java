package lesson7_2;

public class Bunny {
//    public static void main(String[] args) {
//        eatCarrot();
//    }

    private static void eatCarrot() throws NoMoreCarrotsException {}

    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {
            System.out.println("sad rabbit");
        }
    }
}
