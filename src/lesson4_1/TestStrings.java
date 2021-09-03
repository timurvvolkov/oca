package lesson4_1;

public class TestStrings {
    public static void main(String[] args) {
        String name = new String("Пушистик");
        String name1 = "Пушистик";
        String name2 = "Пушистик";
        String name4 = new String("Пушистик");
//        System.out.println(name);
//        System.out.println(name1);

        String s1 = "a";
        String s2 = s1.concat("b");
        s2.concat("c");
        System.out.println(s2);
    }
}
