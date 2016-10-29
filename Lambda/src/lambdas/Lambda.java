/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.function.IntToDoubleFunction;

public class Lambda {

    public static void main(String[] args) {
        IntToDoubleFunction sqrt = (int x) -> Math.sqrt(x);
        //   Object sqrt3 = (int x) -> Math.sqrt(x);
        Object sqrt3 = (IntToDoubleFunction) (int x) -> Math.sqrt(x);
        IntToDoubleFunction sqrt2 = new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int x) {
                return Math.sqrt(x);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };

    }
}
