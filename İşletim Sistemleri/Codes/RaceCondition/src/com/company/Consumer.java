/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acar
 */
public class Consumer implements Runnable {
    
    private final static Random generator=new Random();
    
    private final Buffer sharedLocation;
    
    public Consumer(Buffer shared)
    {
       sharedLocation=shared;
    }
    
    
    public void run()
    {
      int sum=0;
       for(int count=1; count<=10;count++)
       {
           try {
               Thread.sleep(generator.nextInt(3000));
               
               sum+=sharedLocation.get();
               
               
           } catch (InterruptedException ex) {
               Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
           }
          
       }
         System.out.printf("Consumer TERMINATING SUM is"+sum+"\n");
    
      }
    
    
    
}
