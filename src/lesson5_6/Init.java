package lesson5_6;

public class Init {

    //1. Если есть предок - первым инициализируется предок
    //2. Далее инициализируется статические переменные и статические блоки
    //3. Переменные и инициализаторы инстанса (сущности, объекта)
    //4. Конструктор

    private String name = "Азиз";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Init() {
        System.out.println("constructor");
    }
}

class TestInit {

    public static void main(String[] args) {
        Init init = new Init();
    }
}
