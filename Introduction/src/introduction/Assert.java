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
public class Assert {

    static long fact(int n) {
        assert n >= 0 : "n must be positive";
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        fact(-1);
    }
}
