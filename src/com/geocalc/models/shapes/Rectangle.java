package com.geocalc.models.shapes;

/**
 * Definition of a rectangle
 *
 * Created by Daniel on 16.01.2017.
 */
public class Rectangle extends Shape {

    private int xLength;

    private int yLength;

    /**
     * Default constructor. Initializes parent constructor, by setting points to 4
     * and intitializes x and y length of the rectangle
     */
    public Rectangle(int xLength, int yLength) {

        super(4);
        this.xLength = xLength;
        this.yLength = yLength;

    }

    /**
     * Get x length
     *
     * @return x length of rectangle
     */
    public int getxLength() {
        return xLength;
    }

    /**
     * Set x length of rectangle
     *
     * @param xLength new x length
     */
    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    /**
     * Get y length of rectangle
     *
     * @return y length of rectangle
     */
    public int getyLength() {
        return yLength;
    }

    /**
     * Set y length of rectangle
     *
     * @param yLength new y length
     */
    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    @Override
    public int calculateArea() {

        return this.xLength * yLength;

    }
}
