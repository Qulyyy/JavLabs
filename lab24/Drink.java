package lab24;
import java.util.Objects;

public final class Drink implements Item{
    private final int cost;
    private  final String name, description;

    public Drink(String name, String description, int cost) throws IllegalArgumentException{
        if (cost == 0 || Objects.equals(name, "") || Objects.equals(description, ""))
            throw new IllegalArgumentException("Name cannot be null or empty");
        if (cost < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
            this.name = name;
            this.description = description;
            this.cost = cost;
    }
    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}