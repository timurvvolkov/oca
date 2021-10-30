package lesson5_3.zoo3;

import lesson5_3.zoo2.Bird;

public class Swan extends Bird {

    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim() {
//        Bird other = new Bird();
//        other.floatInWater();
//        System.out.println(other.text);
    }
}
