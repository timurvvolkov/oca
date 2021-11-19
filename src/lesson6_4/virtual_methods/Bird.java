package lesson6_4.virtual_methods;

public class Bird {
    public String getName() {
        return "Unknown";
    }

    public void displayInformation() {
        System.out.println("The bird name is: " + getName());
    }
}
