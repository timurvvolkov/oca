package lesson4_2;

public class SBMutabilityAndChaining {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("начало");
        sb
                .append("+середина")
                .append("+завершение");

        System.out.println(sb);
    }
}
