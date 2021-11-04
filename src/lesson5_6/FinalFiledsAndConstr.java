package lesson5_6;

public class FinalFiledsAndConstr {

    private final int volume;
    private final String name = "The Mouse House";

    public FinalFiledsAndConstr(int length, int width, int height) {
        volume = length * width * height;
    }
}
