/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author danecek
 */
public class Box<T> {

    private T t;

    /**
     * Get the value of t
     *
     * @return the value of t
     */
    public T getT() {
        return t;
    }

    /**
     * Set the value of t
     *
     * @param t new value of t
     */
    public void setT(T t) {
        this.t = t;
    }

}
