/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author danecek
 */
public class ReferenceConversion {

    public static void main(String[] args) {
        long lng = 4000000000L;
        int i = (int) lng;
        // value is lost, no exception is raised
        Point point = new Point(1);
        ColoredPoint cp = (ColoredPoint) point;
        // TypeCastException raised
        Point p = new Point(2);

        p = new ColoredPoint(); // substitution
        p.paint(null);             // OK
        p.move(2, 4);           // OK
        System.out.println(p);  // OK

    }
}
