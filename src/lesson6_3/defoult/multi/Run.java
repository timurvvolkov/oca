package lesson6_3.defoult.multi;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
