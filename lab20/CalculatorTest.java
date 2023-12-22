package lab20;

public class CalculatorTest {

    public static void testAddition() {

        CalculatorModel model = new CalculatorModel();
        model.performOperation(5, 7, "+");
        double result = model.getResult();
        if (result == 12) System.out.println("Тест на сложение пройден");
    }


    public static void testSubtraction() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(10, 3, "-");
        double result = model.getResult();
        if (result == 7) System.out.println("Тест на вычитание пройден");
    }


    public static void testMultiplication() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(4, 6, "*");
        double result = model.getResult();
        if (result == 24) System.out.println("Тест на умножение пройден");
    }


    public static void testDivision() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(15, 3, "/");
        double result = model.getResult();
        if (result == 5) System.out.println("Тест на деление пройден");
    }


    public static void testDivisionByZero() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(10, 0, "/");
        double result = model.getResult();
        if (Double.isNaN(result)) System.out.println("Тест на деление на ноль пройден");
    }


    public static void testInvalidToken() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(5, 3, "#"); // Неверный оператор
        double result = model.getResult();
        if (!Double.isNaN(result)) System.out.println("Тест на неверный оператор пройден");
    }


    public static void testEmptyStack() {
        CalculatorModel model = new CalculatorModel();
        model.performOperation(5, 3, "+"); // Добавление числа без операции
        double result = model.getResult();
        if (!Double.isNaN(result)) System.out.println("Тест на пустой стек пройден");
    }

    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testDivisionByZero();
        testInvalidToken();
        testEmptyStack();
    }
}
