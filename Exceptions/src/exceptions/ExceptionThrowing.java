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
public class ExceptionThrowing {

    static void anotherMethod() throws Exception {
        throw new Exception();
    }

    static void someMethod() throws Exception {
        anotherMethod();
    }

    public static void main(String[] args) throws Exception {
        someMethod();
    }

}
