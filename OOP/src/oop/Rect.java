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
public class Rect extends Shape {

    Point refPoint;
    int width, height;

    public Rect(Point refPoint) {
        super(refPoint);
    }

    @Override
    double area() {
        return width * height;
    }

}
