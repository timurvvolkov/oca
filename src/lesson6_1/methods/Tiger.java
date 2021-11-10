package lesson6_1.methods;

public class Tiger extends Cat {

    private int numOfPaws = 4;

    public Tiger(int age) {
        super(age);
        this.size = 4;
    }

    public void showTigerInfo() {
        System.out.println("Возраст тигра " + getAge());
        System.out.println(" и он " + size + " метра в длину");
        System.out.println(" и у него есть " + numOfPaws + " лапы");
    }
}
