package lesson3_2;

public class LogicalOpearators {
    Boolean aBoolean;

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;

        LogicalOpearators logicalOpearators1 = new LogicalOpearators();
        logicalOpearators1.aBoolean = false;
        LogicalOpearators logicalOpearators2 = new LogicalOpearators();


        if (logicalOpearators1.aBoolean && logicalOpearators2.aBoolean) {
            System.out.println("HELLO");
        }
    }
}
