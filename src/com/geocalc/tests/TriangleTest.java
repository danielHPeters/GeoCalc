package com.geocalc.tests;

import com.geocalc.models.shapes.Triangle;
import junit.framework.TestCase;

/**
 * Created by Daniel on 29.01.2017.
 */
public class TriangleTest extends TestCase {

    public void testCalculateArea() throws Exception {
        Triangle tr = new Triangle(10, 20);
        assertEquals(100, tr.calculateArea());

        tr.setcLength(19);
        assertEquals(190, tr.calculateArea());

    }

}