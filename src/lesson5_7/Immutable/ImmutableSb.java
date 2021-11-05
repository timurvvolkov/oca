package lesson5_7.Immutable;

public class ImmutableSb {

    private StringBuilder builder;

    public ImmutableSb(StringBuilder b) {
        builder = new StringBuilder(b);
    }

//    public StringBuilder getBuilder() {
    public String getBuilder() {
//        return new StringBuilder(builder);
        return builder.toString();
    }
}
