package lesson5_8;

import java.util.List;

public class LambdaSyntax {

    public static void test(CheckTrait checker) {

    }

    public static void test(CheckTraitVer2 checker) {

    }

    public static void test(CheckTraitVer3 checker) {

    }

//    public static void test(CheckTraitVer4 checker) {
//
//    }

    public static void test(CheckTraitVer5 checker) {

    }

    public static void main(String[] args) {
//        test(a -> a.canHop());
        test((Animal a) -> {return a.canHop();});

        test(() -> true);
//        test(a -> a.startsWith("test"));
        test((String a) -> a.startsWith("test"));
//        test((a, b) -> a.startsWith("test"));
//        test((String a, String b) -> a.startsWith("test"));

//        test(a, b -> a.startsWith("test"));
//        test(a -> {a.startsWith("test");});
//        test(a -> {return a.startsWith("test") });

        boolean wantWhetherCanHop = true;
        test((animals, a) -> a.canHop() == wantWhetherCanHop);
    }
}
