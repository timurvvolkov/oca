package lesson4_2;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("animals");
        //append
//        stringBuilder
//                .append("a")
//                .append("--")
//                .append(11)
//                .append("--")
//                .append(true);
//        System.out.println(stringBuilder);

        //insert
//        stringBuilder.insert(3, "------");
//        stringBuilder.insert(0, "------");
//        System.out.println(stringBuilder);

        //delete
        //deleteCharAt
//        stringBuilder.delete(0, 2);
//        System.out.println(stringBuilder);
//        stringBuilder.deleteCharAt(2);
//        System.out.println(stringBuilder);

        //reverse
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);

        //toString
        String string = stringBuilder.toString();
        System.out.println(string);
    }
}
