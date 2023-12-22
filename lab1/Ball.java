package lab1;

import java.lang.*;
public class Ball {
    private String color;
    private int r;
    public Ball(String n, int a){
        color = n;
        r = a;
    }
    public Ball(String n){
        color = n;
        r = 5;
    }
    public void setRadius(int age) {
        this.r = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public int getRadius() {
        return this.r;
    }
    public String toString(){
        return this.color +" цвет, " + "радиус = " + this.r;
    }
    public void intoSize(){
        System.out.println(color +" мяч объёмом " + r*3 + "см^3");
    }
}
