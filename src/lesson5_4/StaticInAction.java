package lesson5_4;

public class StaticInAction {

    public static void main(String[] args) {

//        System.out.println(StaticMethodsAndFields.count);
//        StaticMethodsAndFields.main(new String[0]);
//
//        StaticMethodsAndFields ourClass = new StaticMethodsAndFields();
//        System.out.println(ourClass.count);
//        ourClass = null;
//        System.out.println(ourClass.count);

        StaticMethodsAndFields.count = 4;
        StaticMethodsAndFields ourClass1 = new StaticMethodsAndFields();
        StaticMethodsAndFields ourClass2 = new StaticMethodsAndFields();
//        ourClass1.count = 5;
//        ourClass2.count = 6;
        System.out.println(StaticMethodsAndFields.count);
        System.out.println(ourClass1.count);
        System.out.println(ourClass2.count);
    }
}
