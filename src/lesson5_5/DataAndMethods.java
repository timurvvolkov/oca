package lesson5_5;

public class DataAndMethods {

//    public static void main(String[] args) {
//        int num = 4;
//        newNumber(7);
//        System.out.println(num);
//    }
//
//    public static int newNumber(int num) {
//        return num = 8;
//    }

//    public static void main(String[] args) {
//        String name = "Матвей";
//        name = speak(name);
//        System.out.println(name);
//    }
//
//    public static String speak(String name) {
//        return name = name + 1;
//    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        speak(s);
        System.out.println(s);
    }

    public static void speak(StringBuilder s) {
        s.append("Матвей Внутри");
    }
}
