package lesson4_2;

public class ImportantSBMethodsSameAsString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("животные");
        String sub = sb.substring(sb.indexOf("ж"), sb.indexOf("тн"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }
}
