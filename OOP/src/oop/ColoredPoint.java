/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.awt.Color;
import java.awt.Graphics;

class ColoredPoint extends Point {

    Color color;

    public ColoredPoint() {
        super(0, 0);
    }

    ColoredPoint(int x, int y, Color color) {
        super(x, y); // invocation of constructor Point(x,x)
        this.color = color;
    }

//    @Override // annotation - see later
//    void paint(Graphics graphicTool) {
//        graphicTool.setColor(this.color);
//        graphicTool.drawOval(x, y, 1, 1);
//    }

    @Override
    void paint(Graphics graphicTool) {
        graphicTool.setColor(this.color);
        super.paint(graphicTool);  // invocation of method Point.paint
    }

    @Override // annotation - see later
    public String toString() {
        return color + "[" + x + ", " + y + "]";
    }

    public static void main(String[] args) {
        ColoredPoint cp = new ColoredPoint();
        cp.x = 1;            // inherited field
        cp.y = 2;            // inherited field
        cp.color = Color.RED; // declared field
        cp.move(2, 3); // inherited method
        System.out.println(cp); // [1, 2] - unappropriate
        // for ColoredPoint
        Point p = new Point(1);
        System.out.println(p);  // invoked Point.toString
        p = new ColoredPoint();
        System.out.println(p);  // invoked ColoredPoint.toString
    }

}
