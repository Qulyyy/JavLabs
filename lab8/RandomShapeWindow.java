package lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    private Color color;
    private int x;
    private int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), 2 * radius, 2 * radius);
    }
}
class Square extends Shape {
    private int sideLength;

    public Square(Color color, int x, int y, int sideLength) {
        super(color, x, y);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), sideLength, sideLength);
    }
}

class Triangle extends Shape {
    private int[] xPoints;
    private int[] yPoints;

    public Triangle(Color color, int[] xPoints, int[] yPoints) {
        super(color, 0, 0);
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
class RandomShapePanel extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public RandomShapePanel() {
        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int radius = random.nextInt(50) + 10;
            int sideLength = random.nextInt(50) + 10;

            if (i % 3 == 0) {
                shapes[i] = new Circle(randomColor, x, y, radius);
            } else if (i % 3 == 1) {
                shapes[i] = new Square(randomColor, x, y, sideLength);
            } else {
                int[] xPoints = {x, x + sideLength, x + sideLength / 2};
                int[] yPoints = {y + sideLength, y + sideLength, y};
                shapes[i] = new Triangle(randomColor, xPoints, yPoints);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}

public class RandomShapeWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.add(new RandomShapePanel());
            frame.setVisible(true);
        });
    }
}
