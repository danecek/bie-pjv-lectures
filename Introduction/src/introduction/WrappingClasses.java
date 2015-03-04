/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

/**
 *
 * @author danecek
 */
public class WrappingClasses {

    public static void main(String[] args) {
        int iMax = Integer.MAX_VALUE;
        int k = Integer.parseInt("123");
        String s = Integer.toHexString(k);
        double d = Double.NaN;
        boolean b = Double.isNaN(d);
//theirs instances hold immutable value of corresponding prinitive type:
        Integer I = new Integer(123);

    }
}
