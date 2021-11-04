package lesson5_6;

public class ConstructorOverload {

    public static void main(String[] args) {
        Bear bear1 = new Bear("Потапыч");
        Bear bear2 = new Bear("Михапыч", 22, 150);

        System.out.println(bear1.age + ", " + bear1.name + ", " + bear1.weight);
        System.out.println(bear2.age + ", " + bear2.name + ", " + bear2.weight);
    }
}
class Bear {

    public String name;
    public int age;
    public int weight;

    public Bear(String name) {
        this(name, 0);
    }

    public Bear(String name, int age) {
        this(name, age, 20);
    }

    public Bear(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}

