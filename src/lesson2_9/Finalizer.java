package lesson2_9;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {
    private static List objects = new ArrayList();
    protected void finalize() {
        objects.add(this);
    }
}
