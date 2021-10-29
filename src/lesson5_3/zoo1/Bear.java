package lesson5_3.zoo1;

public class Bear {

    public String name;
    String favoriteToy;
    private String secondName;

    public void feedBear(String food) {
        System.out.println("eat food " + food);
        sleepOnly5Hours(1, "f");
    }

    String sleep(int i) {
        sleepOnly5Hours(i, "hello");
        return "went to sleep";
    }

    private void sleepOnly5Hours(int i, String s) {
        System.out.println("sleep for 5 hours");
    }

    protected String doBearStuff() {
        return "Bear Play";
    }
}
