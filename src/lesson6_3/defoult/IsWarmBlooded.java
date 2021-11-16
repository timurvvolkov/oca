package lesson6_3.defoult;

public interface IsWarmBlooded {

    boolean hasScales();

    public default double getTemperature() {
        return 10.0;
    }
}
