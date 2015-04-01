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
public class CatchClauses {

    static void blowUp() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            blowUp();
        } catch (RuntimeException r) {
            System.out.println("Caught RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }

}
