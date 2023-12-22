package lab5;

public class MovableTest {
    public static void main(String[] args) {
        Movable m1 = new MovableCircle(0, 0, 1, 1, 123);
        Movable m2 = new MovableRectangle(32, 42, 54, 77, 1, 9);
        System.out.println(m1);
        System.out.println(m2);
        m1.moveDown();
        m1.moveLeft();
        m2.moveUp();
        m2.moveRight();
        System.out.println(m1);
        System.out.println(m2);
    }
}
