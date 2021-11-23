package lesson7_1;

public class FinallyBlock {

    void explore() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }

    void seeAnimals() {}
    void fall() {}
    void getHugFromDaddy() {}
    void seeMoreAnimals() {}
    void goHome() {}

    public static void main(String[] args) {
        FinallyBlock finallyBlock = new FinallyBlock();
        finallyBlock.test04();
    }

    void test04() {
        String s = "";
        try {
            s += "t";
        } catch (Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.println(s);
    }
}
