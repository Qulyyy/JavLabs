package lab3;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(30, 30);
        System.out.println(ball1);
        ball1.move(45, 45);
        System.out.println(ball1);
    }
}
