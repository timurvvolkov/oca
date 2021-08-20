package lesson2_8;

import lesson2_2.inner2.App5;

public class ClassOrder {
    App5 app5 = new App5();
    int i;

    {
        i = 24;
    }

    public void doSomething(String s) {
        String name = s;
    }
}
