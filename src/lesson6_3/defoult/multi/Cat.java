package lesson6_3.defoult.multi;

public class Cat implements Walk, Run {
//    public int getSpeed() {
//        return 12;
//    }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
