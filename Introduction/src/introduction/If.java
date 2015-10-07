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
public class If {

    public static void main(String[] args) {
        int i = 10;
        if (i) { // error: incompatible types: int cannot be converted to boolean
            i = i-1;
        }
    }
}
