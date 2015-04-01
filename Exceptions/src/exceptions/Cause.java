/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author danecek
 */
public class Cause {

    public static void main(String[] args) {
        Statement stat = null;
        try {
            stat.clearWarnings();
        } catch (SQLException cause) {
            throw new RuntimeException("Database failed", cause);
        }
    }

}
