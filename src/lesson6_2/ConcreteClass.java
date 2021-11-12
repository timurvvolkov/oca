package lesson6_2;

public class ConcreteClass {
}

//abstract class Dog {
//    abstract void eat();
//
//    public static void main(String[] args) {
//        Sharik sharik = new Sharik();
//    }
//}
//
//abstract class Tax extends Dog {
//    abstract void walk();
//}
//
//class Sharik extends Tax {
//    @Override
//    void eat() {
//        System.out.println("hello");
//    }
//
//    @Override
//    void walk() {
//
//    }
//}

abstract class Animal2 {
    public abstract String getName();
}

abstract class Bird extends Animal2 { }

class Flamingo extends Bird {
    public String getName() {
        return "Flamingo";
    }
}
