package ch.peters.daniel.shapecalculator.shape

import ch.peters.daniel.shapecalculator.shapes.Circle
import spock.lang.Specification

/**
 * Circle unit test.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class CircleTest extends Specification {
  def 'calculates a circle with radius'() {
    given:
    def circle = new Circle(68)

    when:
    def area = circle.calculateArea()

    then:
    area == 14519.36d
  }
}