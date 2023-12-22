package lab5;


abstract class Shape {

    protected String color;


    protected boolean filled;

    public Shape() {
        filled = true;
        color = "Red";
    }

    public Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(){
        this.filled = false;
    }
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }

    public String toString(){
        return this.color + " цвет, " + this.filled + " - заполнение";
    }

    public void printInfo() {
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Radius of " + this.color + " ball is " + this.radius;
    }
}

class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double length, double width, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    protected double side;

    public Square () {
        this.side = 0.0;
    }
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Side of " + this.color + " ball is " + this.side;
    }
}

