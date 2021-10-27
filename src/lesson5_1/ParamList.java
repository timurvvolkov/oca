package lesson5_1;

public class ParamList {
    public static void main(String[] args) {
        walk5(1, "sssssss");
    }

    public void walk1() {}
//    public void walk2 {}
    public void walk3(int rename) {
        int i = rename;
    }
//    public void walk4(int a; int b) {}
    public static void walk5 (int a, String b) {}
}
