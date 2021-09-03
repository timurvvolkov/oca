package lesson4_1;

public class StringMethodChaining {
    public static void main(String[] args) {
        String start = " ВаСиЛиЙ ";
//        String trimmed = start.trim();
//        String lowercase = trimmed.toLowerCase();
//        String result = lowercase.replace('в', 'д');
//        System.out.println(result);

        System.out.println(start
                .trim()
                .toLowerCase()
                .replace('л', 'д'));
    }
}
