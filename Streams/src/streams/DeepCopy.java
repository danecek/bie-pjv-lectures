/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author danecek
 */
public class DeepCopy {

    static class Point implements Serializable {

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" + "x=" + x + ", y=" + y + '}';
        }
        int x;
        int y;
    }

    static class Line implements Serializable {

        Point begin, end;

        @Override
        public String toString() {
            return "Line{" + "begin=" + begin + ", end=" + end + '}';
        }

        public Line(Point begin, Point end) {
            this.begin = begin;
            this.end = end;
        }
    }

    static Object deepCopy(Object obj) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(obj);
        }
        return new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray())).readObject();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(deepCopy(new Line(new Point(1, 2), new Point(3, 4))));

    }

}
