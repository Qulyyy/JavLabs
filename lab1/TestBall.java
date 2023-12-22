package lab1;

import lab1.Ball;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Красный", 1);
        Ball d2 = new Ball("Синий", 2);
        Ball d3 = new Ball("Зеленый"); d3.setRadius(3);
        System.out.println(d1);
        d1.intoSize();
        d2.intoSize();
        d3.intoSize();
    }
}