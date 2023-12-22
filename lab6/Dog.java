package lab6;

abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Лабрадор лает.");
    }
}

class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Бульдог рычит.");
    }
}

class DogTest {
    public static void main(String[] args) {

        Dog labrador = new Labrador("Феликс", 3);
        Dog bulldog = new Bulldog("Жаклин", 5);

        labrador.makeSound();
        bulldog.makeSound();
    }
}