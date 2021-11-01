package lesson5_4.difference;

public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(c3.count);

//        System.out.println(count);
    }
}
