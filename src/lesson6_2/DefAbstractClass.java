package lesson6_2;

public class DefAbstractClass {
}

abstract class Cow { }

abstract class Chicken {
    public abstract void peck();
}

//abstract class Turtle {
//    public abstract void swim() {}
//    public abstract int getAge() {
//        return 10;
//    }
//}

//final abstract class Tortoise { }

//abstract class Goat {
//    public abstract final void chew();
//}

abstract class Whale {
    protected abstract void sing();
}

class HumpbackWhale extends Whale {
    protected void sing() {
        System.out.println("Humpback whale is singing");
    }
}
