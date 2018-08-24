package ch.peters.daniel.shapecalculator.shape

import ch.peters.daniel.shapecalculator.shapes.Rectangle
import spock.lang.Specification

/**
 * Rectangle unit test.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class RectangleTest extends Specification {
  def 'calculates rectangle area'() {
    given:
    def rectangle = new Rectangle(17, 21)

    when:
    def area = rectangle.calculateArea()

    then:
    area == 357
  }
}