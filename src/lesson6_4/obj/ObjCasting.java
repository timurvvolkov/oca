package lesson6_4.obj;

import lesson6_4.understanding.Lemur;
import lesson6_4.understanding.Primate;

public class ObjCasting {

    public static void main(String[] args) {

        Lemur lemur = new Lemur();
        Primate primate = lemur;
//        Lemur lemur2 = primate;
        Lemur lemur3 = (Lemur) primate;

        System.out.println(lemur3.age);
    }
}

class Bird {}
class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
//        Bird bird = (Bird) fish;
    }
}

class Rodent {}
class Capybara extends Rodent {

    String name = "";

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        if (rodent instanceof Capybara) {
            Capybara capybara = (Capybara) rodent;
        }
    }
}