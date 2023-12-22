package lab22;
public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Complex Number 1: Real Part - " + complex1.getReal() + ", Imaginary Part - " + complex1.getImaginary());

        Complex complex2 = factory.createComplex(3, 5);
        System.out.println("Complex Number 2: Real Part - " + complex2.getReal() + ", Imaginary Part - " + complex2.getImaginary());

        complex1.setReal(1);
        complex1.setImaginary(-2);
        System.out.println("Complex Number 1 (Updated): Real Part - " + complex1.getReal() + ", Imaginary Part - " + complex1.getImaginary());
    }
}

