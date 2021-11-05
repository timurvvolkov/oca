package lesson5_7.Encapsulation;

public class Bird {

    private int numberEggs = 0;

    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0) {
            System.out.println("слишком мало яиц");
        } else {
            this.numberEggs = numberEggs;
        }
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}
