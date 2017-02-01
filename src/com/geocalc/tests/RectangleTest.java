package com.geocalc.tests;

import com.geocalc.models.shapes.Rectangle;
import junit.framework.TestCase;

/**
 * Created by Daniel on 29.01.2017.
 */
public class RectangleTest extends TestCase {

    public void testCalculateArea() throws Exception {
        Rectangle r = new Rectangle(17, 21);
        assertEquals(357, r.calculateArea());
        r.setxLength(28);
        assertEquals(588, r.calculateArea());
    }

}