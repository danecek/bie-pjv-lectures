/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Scanner;


public class ByteArrayStream {

    static byte[] createByteArray() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Scanner s = new Scanner(System.in);
        while (s.hasNextByte()) {
            ba.write(s.nextByte());
        }
        return ba.toByteArray();
    }

    public static void main(String[] args) {
        byte[] buf = {-1,0,1};
        ByteArrayInputStream bas = new ByteArrayInputStream(buf);
        for (int i =bas.read(); i >= 0; i = bas.read())
            System.out.println(i);
        System.out.println(Arrays.toString(createByteArray()));
    }
}
