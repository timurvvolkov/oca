package lesson4_2;

public class UnderstandingStringBuilder {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("");
        for (char current = 'a'; current <= 'z'; current++) {
            word.append(current);
        }
        System.out.println(word);
    }
}
