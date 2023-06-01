/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company;
import java.util.concurrent.*;
/**
 *
 * @author acar
 */
public class RaceCondition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buffer sharedLocation=new UnsynchronizedBuffer();
        ExecutorService application=Executors.newCachedThreadPool();
        application.execute(new Producer(sharedLocation));
        application.execute(new Consumer(sharedLocation));
        application.shutdown();
        
    }
    
}
