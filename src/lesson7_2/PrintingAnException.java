package lesson7_2;

import java.io.IOException;

public class PrintingAnException {

//    public static void main(String[] args) {
//        try {
//            hop();
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//    private static void hop() {
//        throw new RuntimeException("не может прыгать");
//    }

    public static void main(String[] args) {
        String textInFile = null;

        try {
            readInFile();
        } catch (IOException e) {
            e.printStackTrace(); //надо писать!
        }

        //много кода

        System.out.println(textInFile.replace(" ", ""));
    }

    private static void readInFile() throws IOException {
        throw new IOException();
    }
}
