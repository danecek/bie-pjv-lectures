package generics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danecek
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlainBox pb = new PlainBox();
        pb.setO(1);
        Integer i = (Integer) pb.getO();
        String s = (String) pb.getO();
        Box<Integer> b = new Box<Integer>();
        b.setT(1);
   //     s = b.getT();
    }

}
