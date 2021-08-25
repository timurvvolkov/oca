package lesson3_2;

import java.io.File;

public class EqualityOperators {
    public static void main(String[] args) {
//        int o = 10;
//        int p = 12;
//
//        boolean b1 = true;
//        boolean b2 = true;
//
//        System.out.println(b1 == b2);

//        boolean x = true = 3;
//        boolean y = false != "Giraffe";
//        boolean z = 3 == "Kangaroo";

//        boolean r = false;
//        boolean g = (r = true);
//        System.out.println(r);

        File file1 = new File("myFile.txt");
        File file2 = new File("myFile.txt");
        File file3 = file1;
        System.out.println(file1 == file2);
        System.out.println(file1 == file3);
    }
}
