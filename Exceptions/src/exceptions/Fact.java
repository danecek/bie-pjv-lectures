/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author danecek
 */
public class Fact {

    static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative argument");
        }
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
