package com.alfa.work;

import java.util.Arrays;

public class Runner {

    public void run() {

        Shape[] shapes = {
                new Circle("yellow", 12.8),
                new Circle("green", 15.0),
                new Circle("blake", 14.0),
                new Rectangle("blue", 5, 4),
                new Rectangle("white", 6, 7),
                new Rectangle("yellow", 3, 7),
                new Rectangle("brown", 6, 13),
                new Triangle("green", 11, 14, 16),
                new Triangle("blue", 10.4, 14.7, 16.8),
        };

        Arrays.sort(shapes);
        printShapes(shapes);
        System.out.println();
        //System.out.println("Areas all figures in the masive= " + allAreas(shapes));
        //System.out.println("Areas figures = "+ Arrays.toString(sumFigures(shapes)));
        Shape shape1 = new Rectangle("blue", 15, 4);
        Shape shape2 = new Rectangle("white", 6, 7);
        System.out.println(shape1.draw()+"area= " + shape1.calcArea());
        System.out.println(shape2.draw()+"area= " + shape2.calcArea());
        int result = shape1.compareTo(shape2);
        System.out.println(result);

        Arrays.sort(shapes, new ShapeComparator());
        System.out.println();
        printShapes(shapes);

        System.out.println();
        try {
            System.out.println(shape2.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println();
        Rectangle r = new Rectangle("white", 6, 7);
        System.out.println(new Rectangle(r).draw());


    }

    public void printShapes(Shape[] shapes) {

        for (Shape elements : shapes) {

            System.out.println(elements.draw() + " Figure area= " + elements.calcArea());

        }


    }



    }

