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
public class Circle extends Shape {

    public Circle(Point refPoint, double radius) {
        super(refPoint);
     //   this.refPoint = refPoint;
        this.radius = radius;
    }

    Point refPoint;
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

}
