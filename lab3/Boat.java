package lab3;

public class Boat extends GameEntity {
    public boolean isUpturned;  // Перевернута ли шлюпка
    public boolean isOnLand;    // Находится ли шлюпка на суше
    public int power;

    public Boat(String name, int power) {
        super(name);
        this.isUpturned = false;
        this.isOnLand = true;
        this.power = power;
    }

    // метод для переворачивания шлюпки
    public void performAction() {
        if (power > 7) {
            this.isUpturned = true;
            System.out.println(name + " переворачивает шлюпку.");
        } else {
            System.out.println(name + " не может перевернуть шлюпку.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Перевернута: " + isUpturned + ", На суше: " + isOnLand + ")";
    }
}
