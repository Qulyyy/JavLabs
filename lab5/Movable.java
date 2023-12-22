package lab5;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;

    public MovableCircle() {}
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int r) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = r;
    }

    public String toString() {
        return "Позиция - " + center.x + ", " + center.y + " \nскорость x: " + center.xSpeed + ", y: " +center.ySpeed;
    }

    public void moveUp() {
        center.x += center.xSpeed;
    }
    public void moveDown() {
        center.x -= center.xSpeed;
    }
    public void moveLeft() {
        center.y += center.ySpeed;
    }
    public void moveRight() {
        center.y -= center.ySpeed;
    }
}

class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle() {}
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void check() {
        if (topLeft.xSpeed != topLeft.ySpeed) {
            topLeft.ySpeed = (topLeft.xSpeed + topLeft.ySpeed) / 2;
            bottomRight.ySpeed = (bottomRight.ySpeed + bottomRight.xSpeed) / 2;
            topLeft.xSpeed = (topLeft.ySpeed + topLeft.xSpeed) / 2;
            bottomRight.xSpeed = (bottomRight.ySpeed + bottomRight.xSpeed) / 2;
        }
        if (topLeft.xSpeed != topLeft.ySpeed) {
            topLeft.ySpeed = topLeft.xSpeed;
            bottomRight.xSpeed = topLeft.xSpeed;
            bottomRight.ySpeed = topLeft.xSpeed;
        }
    }
    public String toString() {
        return "topLeft x: " + topLeft.x + ", y " + topLeft.y + " bottomRight x " + bottomRight.x + ", y " + bottomRight.y + "  Speed x "
                + topLeft.xSpeed + "/" + bottomRight.ySpeed;
    }

    public void moveUp() {
        check();
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    public void moveDown() {
        check();
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    public void moveLeft() {
        check();
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    public void moveRight() {
        check();
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int X, int Y, int xSpeed, int ySpeed) {
        x = X;
        y = Y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "Позиция " + x + ", " + y + " скорость x:" + xSpeed + ", y:" + ySpeed;
    }

    public void moveUp() {
        x += xSpeed;
    }
    public void moveDown() {
        x -= xSpeed;
    }
    public void moveLeft() {
        y += ySpeed;
    }
    public void moveRight() {
        y -= ySpeed;
    }
}