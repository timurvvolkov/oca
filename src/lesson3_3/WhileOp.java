package lesson3_3;

public class WhileOp {
    int roomInBelly = 5;

    public static void main(String[] args) {
        WhileOp whileOp = new WhileOp();
        whileOp.eatCheese(8);
    }

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
            System.out.println(roomInBelly);
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }
}
