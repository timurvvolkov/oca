package lesson7_1;

public class RecRuntimeExceptions {
    public static void main(String[] args) {

        RecRuntimeExceptions recRuntimeExceptions = new RecRuntimeExceptions();
        recRuntimeExceptions.printLength();
//        int answer = 11 / 0;

//        int[] countOfMoose = new int[3];
//        System.out.println(countOfMoose[-1]);

//        String type = "moose";
//        Integer number = (Integer) type;

//        String type = "moose";
//        Object obj = type;
//        Integer number = (Integer) obj;

//        Integer.parseInt("abc");
    }

//    int numberEggs = 0;
//    public void setNumberEggs(int numberEggs) {
//        if (numberEggs >= 0) {
//            this.numberEggs = numberEggs;
//        }
//    }

//    public void setNumberEggs(int numberEggs) {
//        if (numberEggs < 0) {
//            throw new IllegalArgumentException("# eggs must not be negative");
//        }
//        this.numberEggs = numberEggs;
//    }

    String name;
    public void printLength() throws NullPointerException {
        System.out.println(name.length());
    }
}
