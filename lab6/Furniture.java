package lab6;

abstract class Furniture {
    private String type;
    private String material;

    public Furniture(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public abstract void displayInfo();

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}

class Chair extends Furniture {
    public Chair(String material) {
        super("Стул", material);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип: Стул, Материал: " + getMaterial());
    }
}

class Table extends Furniture {
    public Table(String material) {
        super("Стол", material);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип: Стол, Материал: " + getMaterial());
    }
}
class FurnitureShop {
    private Furniture item;

    public FurnitureShop(Furniture furniture) {
        this.item = furniture;
    }

    public Furniture getFurniture() {
        return item;
    }

    public void displayInventory() {
        item.displayInfo();
    }
}

class Main {
    public static void main(String[] args) {
        Furniture chair = new Chair("Дерево");
        Furniture table = new Table("Стекло");

        FurnitureShop shop1 = new FurnitureShop(chair);
        FurnitureShop shop2 = new FurnitureShop(table);

        shop1.displayInventory();
        shop2.displayInventory();
    }
}
