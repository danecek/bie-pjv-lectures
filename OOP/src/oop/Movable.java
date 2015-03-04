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
public interface Movable {

    void move(int dx, int dy);
    int STEP = 2;            // public static final


    default void moveX(int x) {
        move(x, 0);
    } // public

    default void moveY(int y) {
        move(0, y);
    } // public
}
