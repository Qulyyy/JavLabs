package lab4;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Черные", 2);
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(true, 5);

        Human person = new Human(head, leftLeg, rightLeg, leftHand, new Hand(true, 5));

        System.out.println("Информация о человеке:");
        System.out.println("Цвет волос: " + person.getHead().getHairColor());
        System.out.println("Цвет глаз: " + person.getHead().getEyeColor());
        System.out.println("Длина левой ноги: " + person.getLeftLeg().getLength() + " см");
        System.out.println("Длина правой ноги: " + person.getRightLeg().getLength() + " см");
        System.out.println("Левая рука с пальцами: " + person.getLeftHand().hasFingers());
        System.out.println("Количество пальцев на правой руке: " + person.getRightHand().getFingerCount());
    }
}