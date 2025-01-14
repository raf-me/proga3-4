package lab3;

public abstract class GameEntity {
    Name name = Name.Ivan;  // Имя объекта

    public GameEntity(String name) {
    }

    // Абстрактный метод, который будет реализован в каждом конкретном классе
    public abstract void performAction() throws InsufficientPowerException;

    @Override
    public String toString() {
        return "Объект: " + name;
    }
}
