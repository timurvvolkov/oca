package lesson2_7;

public class ScopeOfVars {
    int qty;

    public void doSomething() {
        int newQty = 0;
        if (qty > -1) {
            qty = 28;
        } else {
            ///
        }

        System.out.println(qty);
        System.out.println(newQty);
    }

    public void calculate() {
        int summ = 17 + qty;
    }
}
