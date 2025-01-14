package lab3;

public class Preparation extends GameEntity {
    private final String work;

    public Preparation(String name, String work) {
        super(name);  // Имя персонажа или объекта подготовки
        this.work = work;
    }

    // Переопределенный метод для работы над подготовкой
    public void performAction() {
        System.out.println(name + " не пожалел сил на эту бесплодную " + work);
    }

    public void time() {
        System.out.println("Потратив на нее недели три или четыре.");
    }
}
