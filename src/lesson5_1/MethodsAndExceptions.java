package lesson5_1;

public class MethodsAndExceptions {
    public void zeroExceptions() {}

    public void oneException() throws IllegalArgumentException {}

    public void twoExceptions() throws IllegalArgumentException, InterruptedException {}

    public static void main(String[] args) throws InterruptedException {
        MethodsAndExceptions methodsAndExceptions = new MethodsAndExceptions();
        methodsAndExceptions.doSome();
    }

    public void doSome() throws InterruptedException {
        twoExceptions();
    }
}
