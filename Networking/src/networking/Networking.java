/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author danecek
 */
public class Networking {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL fit = new URL("http://fit.cvut.cz");
        HttpURLConnection connection = (HttpURLConnection) fit.openConnection();
        connection.setRequestMethod("GET");
        InputStream intput = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(intput));
        for (String l = br.readLine(); l != null; l = br.readLine()) {
            System.out.println(l);
        }
        // TODO code application logic here
    }

}
