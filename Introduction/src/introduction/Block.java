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
public class Block {

    public static void main(String[] args) {
        {
            final int i = 2;
            System.out.println("i=" + i);
            int j = 3;
            System.out.println("j=" + j);
            int iPlusj = i + j;
            System.out.println(i + "+" + j
                    + "==" + iPlusj);
        }
    }
}
