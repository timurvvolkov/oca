package lesson4_4;

import java.util.Arrays;

public class ArrayOfReference {
    public static void main(String[] args) {
        String[] birds = {"канарейка", "попугай", "ворон"};
        String[] alias = birds;
//        System.out.println(birds.equals(alias));
//        System.out.println(birds.toString());
//        System.out.println(Arrays.toString(birds));

        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));

        String[] s = {"привет"};
        Object[] objects = s;
        String[] s2 = (String[]) objects;
//        s2[0] = new StringBuilder();
        objects[0] = new StringBuilder();
    }
}
