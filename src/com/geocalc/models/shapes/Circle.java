package com.geocalc.models.shapes;

/**
 * Created by Daniel on 30.01.2017.
 */
public class Circle extends Shape{

    /**
     * Radius of the circle
     */
    private double radius;

    /**
     * Pi as constant value
     */
    private final double PI = 3.14;

    /**
     * Default constructor. Initializes radius and points
     */
    public Circle(double radius){

        super(0);
        this.radius = radius;

    }

    /**
     * Calculate the area of the circle
     */
    public int calculateArea(){
        return (int)(this.PI * this.radius * this.radius);
    }

    /**
     * Get the radius of this circle
     * @return the radius of this circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius of this circle
     * @param radius new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
