package lesson7_1;

public class TryStatements {

    public static void main(String[] args) {
        TryStatements tryStatements = new TryStatements();
        tryStatements.explore();
    }

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            System.out.println(e.getStackTrace());
            getUp();
        }
    }

    void fall() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("get up!!");
    }
}
