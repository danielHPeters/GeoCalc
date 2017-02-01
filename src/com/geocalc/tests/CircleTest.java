package com.geocalc.tests;

import com.geocalc.models.shapes.Circle;
import junit.framework.TestCase;

/**
 * Created by Daniel on 30.01.2017.
 */
public class CircleTest extends TestCase {

    public void testCalculateArea() throws Exception {
        Circle c = new Circle(68);
        assertEquals(14519, c.calculateArea());
        c.setRadius(28);
        assertEquals(2461, c.calculateArea());
    }

}