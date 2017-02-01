package com.geocalc.models.shapes;

/**
 * Abstract class which lays the foundation for different shape types (eg. triangle, rectangle etc.)
 *
 * Created by Daniel on 16.01.2017.
 */
public abstract class Shape {

    /**
     * Number of points on the shape (eg. 3 for Triangle)
     */
    private int points;

    /**
     * @param points
     */
    public Shape(int points) {
        
        this.points = points;
        
    }

    /**
     * Calculate area of shape
     */
    public abstract int calculateArea();

    /**
     * @return
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points
     */
    public void setPoints(int points) {
        this.points = points;
    }
}
