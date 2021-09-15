package lesson4_3;

public class Equality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one.equals(two));
        System.out.println(one.equals(three));

        String x = new String("Hello World!");
        String y = "Hello World!";
        System.out.println(x.equals(y));
    }
}
