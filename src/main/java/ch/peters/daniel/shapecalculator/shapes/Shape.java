package ch.peters.daniel.shapecalculator.shapes;

import java.io.Serializable;

/**
 * Base shape class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public abstract class Shape implements Serializable {
  private int points;

  Shape(int points) {
    this.points = points;
  }

  public abstract double calculateArea();

  public int getPoints() {
    return points;
  }
}
