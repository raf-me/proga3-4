package lab3;

public class Character extends GameEntity {
    public int power;  // Сила персонажа

    public Character(String name, int power) {
        super(name);  // Вызов конструктора родительского класса
        this.power = power;
    }

    // для выполнения действия (например, попытка перевернуть шлюпку)
    @Override
    public void performAction() throws InsufficientPowerException {
        if (power < 1) {
            throw new InsufficientPowerException(name + " не имеет силы!");
        }
        else if (power > 9) {
            System.out.println(name + " использует свою силу и переворачивает шлюпку.");
        } else {
            System.out.println(name + " пытается перевернуть шлюпку, но не хватает силы.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Сила: " + power + ")";
    }
}

