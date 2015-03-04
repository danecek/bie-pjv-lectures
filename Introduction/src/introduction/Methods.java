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
public class Methods {

    static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }
    
    public static void main(String[] args) {
        System.out.println("" + max(-1, 1));
    }
}
