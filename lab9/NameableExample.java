package lab9;


interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class NameableExample {
    public static void main(String[] args) {

        Planet earth = new Planet("Earth");
        Animal dog = new Animal("Buddy");


        System.out.println("Planet name: " + earth.getName());
        System.out.println("Animal name: " + dog.getName());
    }
}

