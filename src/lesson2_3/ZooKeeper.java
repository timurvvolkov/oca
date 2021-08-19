package lesson2_3;

public class ZooKeeper {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("Petya");
        System.out.println(chicken.name);
        chicken = new Chicken();
        System.out.println(chicken.name);
    }
}
