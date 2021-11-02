package lesson5_5;

public class AutoboxingRef {

//    public void fly(String s) {
//        System.out.print("Стринг ");
//    }

    public void fly(Object o) {
        System.out.print("Объект ");
    }

    public static void main(String[] args) {
        AutoboxingRef r = new AutoboxingRef();
        r.fly("тест");
        r.fly(56);
    }
}
