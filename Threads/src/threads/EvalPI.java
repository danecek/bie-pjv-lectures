/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class EvalPI implements Callable<Double> {

    int timeOut;
    long iteration;

    public EvalPI(long iteration, int timeOut) {
        this.timeOut = timeOut;
        this.iteration = iteration;
    }

    @Override
    public Double call() throws Exception {
        double x = 1;
        long start = System.currentTimeMillis();
        for (long i = 1; i <= iteration; i++) {
            if (System.currentTimeMillis() - start > timeOut) {
                throw new Exception("timeout");
            }
            long k = 2 * i + 1;
            if (i % 2 == 1) {
                k = k * -1;
            }
            x += 1.0 / k;
        }
        return 4 * x;
    }

    public static void main(String[] args) {
        ExecutorService es = null;
        try {
            es = Executors.newCachedThreadPool();
            Future<Double> f = es.submit(new EvalPI(10000000l, 5000));
            while (!f.isDone()) {
                Thread.sleep(200);
                System.out.println("EvalPI is stillrunning");
            }   
            System.out.println(f.get());

        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(EvalPI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            es.shutdown();
        }

    }

}
