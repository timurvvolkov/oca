package lesson2_4;

import java.util.Date;

public class RefTypes {
    Date today = new Date();
    String greeting = "How are you?";

    public static void main(String[] args) {
        RefTypes refTypes = new RefTypes();
        refTypes.today = null;
        refTypes.today = new Date();
    }
}
