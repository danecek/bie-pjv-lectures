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
public class ExcpetionCatching {

    public static void main(String[] args) {
        int i = 0;
        int j;
        try {
            j = 1 / i;    // ArtithmeticException is thrown
        } catch (ArithmeticException e) {
            j = Integer.MAX_VALUE;
        }
        System.out.println(j);

    }
}
