package lesson3_2;

public class Casting {
    public static void main(String[] args) {
        int x = (int) (1.0 + 3.0);
        short y = (short) 1921222;
        int z = (int) 9f;
        long t = 192301398193810323L;

        //System.out.println(y);

        int maxInt = -2147483647;
        System.out.println(maxInt - 5);
    }
}
