package lab6;

abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
class Plate extends Dish {
    public Plate(String material, String color) {
        super(material, color);
    }

    @Override
    public void use() {
        System.out.println("Использую тарелку для еды");
    }
}

class Cup extends Dish {
    public Cup(String material, String color) {
        super(material, color);
    }

    @Override
    public void use() {
        System.out.println("Использую чашку, чтобы попить.");
    }
}

class DishTest {
    public static void main(String[] args) {
        // Тестирование классов для посуды
        Dish plate = new Plate("Керамика", "Белая");
        Dish cup = new Cup("Стекляная", "Чистая");

        plate.use();
        cup.use();
    }
}