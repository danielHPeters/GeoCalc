package com.geocalc;

import com.geocalc.models.shapes.Shape;
import com.geocalc.models.shapes.Triangle;

public class Main {

    public void calculate(Shape s){

        System.out.print(s.calculateArea());

    }

    public static void main(String[] args) {

        Main m = new Main();
        m.calculate(new Triangle(13 , 10));

    }
}
