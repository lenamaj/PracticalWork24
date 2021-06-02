package com.alfa.work;


public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                " a=" + a +
                ", b=" + b +
                ", c=" + c +
                ';';
    }

    @Override
    public double calcArea() {

        if(a + b > c|| b + c > a|| a + c > b) {
            return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));

        }  else {

            return 0.0;
            //System.out.println("Wrong triangle");

        }

    }

    @Override
    public String draw() {
        return this.toString();
    }
}
