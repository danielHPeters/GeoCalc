package ch.peters.daniel.shapecalculator.shape

import ch.peters.daniel.shapecalculator.shapes.Triangle
import spock.lang.Specification

/**
 * Triangle unit test.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class TriangleTest extends Specification {
  def 'calculates the triangle area'() {
    given:
    def triangle = new Triangle(10, 20)

    when:
    def area = triangle.calculateArea()

    then:
    area == 100
  }
}