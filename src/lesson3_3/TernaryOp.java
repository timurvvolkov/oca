package lesson3_3;

public class TernaryOp {
    public static void main(String[] args) {
//        int y = 10;
//        final int x;
//
//        if (y > 5) {
//            x = 2 * y;
//        } else {
//            x = 3 * y;
//        }

        int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y);

        int z = (y == 10) ? (x > 5 ? 23 : 55) : 33;
    }
}
