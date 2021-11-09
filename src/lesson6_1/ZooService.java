package lesson6_1;

public class ZooService {

    public static void main(String[] args) {

        Lion lion = new Lion();

        lion.setAge(11);
        lion.setName("Simba");

        System.out.println("name = " + lion.getName());
    }
}
