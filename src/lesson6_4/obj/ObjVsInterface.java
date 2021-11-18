package lesson6_4.obj;

import lesson6_4.understanding.Lemur;

public class ObjVsInterface {
    Lemur lemur = new Lemur();
    Object lemurAsObject = lemur;

    public static void main(String[] args) {
        ObjVsInterface objVsInterface = new ObjVsInterface();
    }
}
