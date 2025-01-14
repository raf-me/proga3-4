package lab3;

import java.util.Objects;

public class Environment {
    private final String ocean;
    Name name = Name.Ivan;

    public Environment(String ocean) {
        this.ocean = ocean;
    }

    public void attemptToReachOcean(Character character) {
        System.out.println(character + " продолжает стремиться к " + ocean);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Environment that = (Environment) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(ocean, that.ocean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ocean);
    }
}
