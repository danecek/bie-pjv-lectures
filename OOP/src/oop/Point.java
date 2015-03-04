/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.awt.Graphics;

/**
 *
 * @author danecek
 */
public class Point implements Movable {

    static Point firstCreatedPoint; // initialized to null
    // reference to the first created object Point

    static double distance(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    Point(int a) {
        this(a, a); // explicit constructor invocation
    }

    double distanceFrom(Point p) {
        return distance(this, p); // static method invocation
    }

    static double distance2(Point p1, Point p2) {
        return p1.distanceFrom(p2);
        // invocation of instance method
    }

    double distanceFrom2(Point p) {
        int dx = x - p.x;
        int dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    Point(int x, int y) {
        if (firstCreatedPoint == null) {
            firstCreatedPoint = this;
        }
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < -1000 || x > 1000) {
            throw new IllegalArgumentException("out of range");
        }
        this.x = x;
    }

    void paint(Graphics graphicTool) {
        graphicTool.drawOval(x, y, 1, 1);
    }

    @Override  // see Overriding
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    @Override
    public void move(int dx, int dy) { // instance method
        this.x += dx;
        this.y += dy;
    }

}
