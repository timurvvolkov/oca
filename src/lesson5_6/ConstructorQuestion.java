package lesson5_6;

public class ConstructorQuestion {

    private String color;
    private int height;
    private int length;

    public ConstructorQuestion(int length, int theHeight) {
        this.length = length;
        height = theHeight;
        this.color = "белый";
    }

    public static void main(String[] args) {
        ConstructorQuestion cQuestion = new ConstructorQuestion(1, 2);
        System.out.println(cQuestion.length + " " + cQuestion.height + " " + cQuestion.color);
    }
}
