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
abstract class Shape {

    Point refPoint;

    Shape(int x, int y) {
      this(new Point(x, y));
    }
    Shape(Point refPoint) {
      this.refPoint = refPoint;
    }

    abstract double area();     // abstract method
    void move(int x, int y) {   // concrete method
      refPoint.move(x, y);
    }

}
