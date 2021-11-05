package lesson5_7.Immutable;

public class NotImmutableSb {

    private StringBuilder builder;

    public NotImmutableSb(StringBuilder b) {
        builder = b;
    }

    public StringBuilder getBuilder() {
        return builder;
    }
}
