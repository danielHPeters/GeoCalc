package ch.peters.daniel.shapecalculator.shapes;

/**
 * Circle shape.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Circle extends Shape {
  private static final double PI = 3.14;
  private double radius;

  public Circle(double radius) {
    super(0);
    this.radius = radius;
  }

  public double calculateArea() {
    return (Circle.PI * radius * radius);
  }

  public double getRadius() {
    return radius;
  }
}
