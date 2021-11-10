package lesson6_1.methods;

public class Overriding {

}

class Dog {
    public double getAverageWeight() {
        return 50;
    }
}

class Wolf extends Dog {
    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Dog().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
