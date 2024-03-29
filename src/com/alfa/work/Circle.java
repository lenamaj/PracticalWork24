package com.alfa.work;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                " radius=" + radius +
                ';';
    }

    @Override
    public double calcArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String draw() {
        return this.toString();

    }


}
