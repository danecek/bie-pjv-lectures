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
public class ChessMan implements Movable {

    int row;
    int column;

    @Override
    public void move(int dx, int dy) {
        row += dx;
        column = +dy;
    }

    public static void main(String[] args) {
        Movable m1 = new ChessMan();
        Movable m2 = new Point(1);
    }
}
