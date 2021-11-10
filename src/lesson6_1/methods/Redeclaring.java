package lesson6_1.methods;

public class Redeclaring {
}

class Camel {

    private String getNumberOfHumps() {
        return "Undefined";
    }
}

class BactrianCamel extends Camel {

    //@Override - no override because private method in superclass
    private String getNumberOfHumps() {
        return "";
    }
}
