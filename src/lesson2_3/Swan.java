package lesson2_3;

public class Swan {
    int numEggs;

    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.numEggs = 7;
        System.out.println("Кол-во яиц: " + swan.numEggs);
        Swan swanNew = new Swan();
        System.out.println("Кол-во яиц: " + swanNew.numEggs);
    }
}
