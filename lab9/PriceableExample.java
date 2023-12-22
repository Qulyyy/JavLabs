package lab9;

interface Priceable {
    double getPrice();
}

class Car implements Priceable {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}


class Laptop implements Priceable {
    private double price;

    public Laptop(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class PriceableExample {
    public static void main(String[] args) {

        Car toyota = new Car(25000.0);
        Laptop dell = new Laptop(1000.0);


        System.out.println("Car price: $" + toyota.getPrice());
        System.out.println("Laptop price: $" + dell.getPrice());
    }
}

