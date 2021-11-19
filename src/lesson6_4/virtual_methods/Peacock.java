package lesson6_4.virtual_methods;

public class Peacock extends Bird {
    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
    }
}
