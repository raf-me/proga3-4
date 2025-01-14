package lab3;

public class Brainorpower extends GameEntity {
    public int power;

    public Brainorpower(String name, int power) {
        super(name);
        this.power = power;
    }

    // Переопределенный метод для уверенности в успехе
    @Override
    public void performAction() {
        if (power > 15) {
            System.out.println(name + " использует свою силу и переворачивает шлюпку.");
            System.exit(0);
        } else {
            System.out.println(name + " понимает, что с его силами перевернуть шлюпку невозможно.");
        }
    }
}
