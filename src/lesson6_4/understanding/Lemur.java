package lesson6_4.understanding;

public class Lemur extends Primate implements HasTail {

    @Override
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

//        HasTail hasTail1 = lemur;
//        System.out.println(hasTail1.age);
//        System.out.println(hasTail1.hasHair());
//
//        Primate primate1 = lemur;
//        System.out.println(primate1.age);
//        System.out.println(primate1.isTailStriped());
    }
}
