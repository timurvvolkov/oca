package lesson4_6;

public class WrappersInJava {
    public static void main(String[] args) {
        boolean b = true;
        Boolean aBoolean = new Boolean(true);
        System.out.println(aBoolean);

        byte b1 = 1;
        Byte aByte = new Byte((byte) 1);
        System.out.println(aByte);

        short s = 1;
        Short aShort = new Short((short) 1);
        System.out.println(aShort);

        int i = 1;
        Integer aInteger = new Integer(1);
        System.out.println(aInteger);

        long l = 1;
        Long aLong = new Long(1);
        System.out.println(aLong);

        float v = 1.0f;
        Float aFloat = new Float(1.0);
        System.out.println(aFloat);

        double v1 = 1.0;
        Double aDouble = new Double(1.0);
        System.out.println(aDouble);

        char c = 'c';
        Character character = new Character('c');
        System.out.println(character);

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        System.out.println(primitive);
        System.out.println(wrapper);

//        int bad1 = Integer.parseInt("a");
//        Integer bad2 = Integer.valueOf("123.45");
    }
}
