package com.geocalc.models.shapes;

/**
 * Class representing a triange.
 *
 * Created by Daniel on 16.01.2017.
 */
public class Triangle extends Shape {

    private int angleAlpha;

    private int angleBeta;

    private int angleGamma;

    private int aLength;

    private int bLength;

    private int cLength;

    private int heightC;

    /**
     * Default constructor. Initializes the parent constructor
     * and also initializes thee angles and sides of the triangle
     */
    public Triangle(int cLength, int heightC) {

        super(3);
        this.cLength = cLength;
        this.heightC = heightC;

    }

    /**
     * Get alpha angle
     * @return the alpha angle of the triangle object
     */
    public int getAngleAlpha() {
        return angleAlpha;
    }

    /**
     * Set alpha angle of triangle
     * @param angleAlpha new alpha angle
     */
    public void setAngleAlpha(int angleAlpha) {
        this.angleAlpha = angleAlpha;
    }

    /**
     * Get beta angle
     * @return the beta angle of the triangle object
     */
    public int getAngleBeta() {
        return angleBeta;
    }

    /**
     * Set beta angle of triangle
     * @param angleBeta new beta triangle
     */
    public void setAngleBeta(int angleBeta) {
        this.angleBeta = angleBeta;
    }

    /**
     *Get gamma angle
     * @return the gamma angle of the triangle object
     */
    public int getAngleGamma() {
        return angleGamma;
    }

    /**
     * Set gamma angle of triangle
     * @param angleGamma new beta triangle
     */
    public void setAngleGamma(int angleGamma) {
        this.angleGamma = angleGamma;
    }

    /**
     * Get length of side a
     * @return current objects length of side a
     */
    public int getaLength() {
        return aLength;
    }

    /**
     * Set length of side a
     * @param aLength new length for side a
     */
    public void setaLength(int aLength) {
        this.aLength = aLength;
    }

    /**
     * Get length of side b
     * @return bLength current objects length of side b
     */
    public int getbLength() {
        return bLength;
    }

    /**
     * Set length of side b
     * @param bLength new length for side b
     */
    public void setbLength(int bLength) {
        this.bLength = bLength;
    }

    /**
     * Get length of side c
     * @return
     */
    public int getcLength() {
        return cLength;
    }

    /**
     * Set length of side c
     * @param cLength new length for side c
     */
    public void setcLength(int cLength) {
        this.cLength = cLength;
    }

    /**
     *Get height c
     * @return height c of current object
     */
    public int getHeightC() {
        return heightC;
    }

    /**
     * Set height c
     * @param heightC new height c
     */
    public void setHeightC(int heightC) {
        this.heightC = heightC;
    }

    @Override
    public int calculateArea(){

        return this.heightC * this.cLength / 2;

    }
}
