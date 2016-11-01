/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

/**
 *
 * @author danecek
 */
public class Collections {

    public static void main(String[] args) {
        ObservableList<String> oal = FXCollections.observableArrayList("a");
        oal.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("invalidated:" + observable);
            }
        });
        oal.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(ListChangeListener.Change<? extends String> c) {
                while (c.next()) {
                    System.out.println(c.getList());
                    System.out.println(c.getAddedSubList());
                    System.out.println(c.getRemoved());
                    System.out.println(c);
                }
            }
        });
        oal.addAll("b", "c");

    }
}
