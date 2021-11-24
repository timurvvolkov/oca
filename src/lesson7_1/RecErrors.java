package lesson7_1;

public class RecErrors {
    //ExceptionInInitializerError
    //StackOverflowError
    //NoClassDefFoundError

//    static {
//        int[] countsOfMoose = new int[3];
//        int num = countsOfMoose[-1];
//    }

    public static void main(String[] args) {
        doNotCodeThis(3);
    }

    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }
}
