package lesson5_2;

public class MethodsAndVarargs {
    public void walk1(int... nums) {}
    public void walk2(int start, int... nums) {}
//    public void walk3(int... nums, int start) {}
//    public void walk4(int... start, int... nums) {}

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

//    public static void main(String[] args) {
//        walk(1);
//        walk(1, 1);
//        walk(1, 2, 3);
//        walk(1, new int[] {1, 2});
//        walk(1, null);
//    }

    public static void run(int... nums) {
        System.out.println(nums[1]);
    }

    public static void main(String... args) {
        run(11, 22);
    }
}
