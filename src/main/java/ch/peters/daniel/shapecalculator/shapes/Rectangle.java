package ch.peters.daniel.shapecalculator.shapes;

/**
 * Circle shape.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    super(4);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}
