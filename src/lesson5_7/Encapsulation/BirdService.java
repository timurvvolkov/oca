package lesson5_7.Encapsulation;

public class BirdService {

    public static void main(String[] args) {

        Bird bird = new Bird();

        bird.setNumberEggs(-3);

        System.out.println(bird.getNumberEggs());
    }
}
