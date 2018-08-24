package ch.peters.daniel.shapecalculator.shapes;

/**
 * Triangle shape.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Triangle extends Shape {
  private double alpha;
  private double beta;
  private double gamma;
  private double sideA;
  private double sideB;
  private double sideC;
  private double heightC;

  public Triangle(double sideC, double heightC) {
    super(3);
    this.sideC = sideC;
    this.heightC = heightC;

  }

  public double getAlpha() {
    return alpha;
  }

  public double getBeta() {
    return beta;
  }

  public double getGamma() {
    return gamma;
  }

  public double getSideA() {
    return sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public double getSideC() {
    return sideC;
  }

  public double getHeightC() {
    return heightC;
  }

  @Override
  public double calculateArea() {
    return this.heightC * this.sideC / 2;
  }
}
