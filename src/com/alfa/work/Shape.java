package com.alfa.work;

public abstract class Shape implements Drawable, Comparable, Cloneable {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class=" + this.getClass().getSimpleName() +
                " color=" + color + ';';
    }

    public abstract double calcArea();

    @Override
    public String draw() {
       return this.toString();

    }

    @Override
   public int compareTo(Object o){
        Shape shape = (Shape) o;
        if (shape.calcArea() > this.calcArea()) return -1;
        if (shape.calcArea() < this.calcArea()) return 1;
        return 0;
   }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
