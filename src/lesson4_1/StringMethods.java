package lesson4_1;

public class StringMethods {
    public static void main(String[] args) {
//        String animal = "animals";

        //length()
//        System.out.println(animal.length());

        //charAt()
//        System.out.println(animal.charAt(0));
//        System.out.println(animal.charAt(6));
//        System.out.println(animal.charAt(7));

        //indexOf()
//        System.out.println(animal.indexOf('n'));
//        System.out.println(animal.indexOf("z", 5));

        //substring()
//        System.out.println(animal.substring(2));
//        System.out.println(animal.substring(3, 8));

        //toUpperCase()
        //toLowerCase()
        String animal = "aNimals";
        String animal2 = "crocodile";
//        System.out.println(animal.toUpperCase());

        //equals()
        //equalsIgnoreCase()
//        System.out.println(animal.equals(animal2));
//        System.out.println(animal.equalsIgnoreCase(animal2));

        //startsWith()
        //endsWith()
//        System.out.println(animal.startsWith("aN"));
//        System.out.println(animal.endsWith("svwv"));

        //contains()
//        System.out.println(animal.contains("z"));

        //replace()
//        System.out.println(animal.replace('a', 'b'));
        System.out.println(animal.
                toLowerCase().
                replace("an", "zzzzzzz"));

        //trim()
        String whiteSpace = "      ssss    ";
        System.out.println(whiteSpace.trim());
    }
}
