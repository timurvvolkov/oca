package lesson2_3;

public class Chick {
    String name = "Пушистик";

    {
        System.out.println("Заношу информацию в поле name");
    }

    public Chick() {
        name = "Тини";
        System.out.println("Конструктор меняет значение поля name");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println("Запускаем создание объекта");
        System.out.println(chick.name);
    }
}
