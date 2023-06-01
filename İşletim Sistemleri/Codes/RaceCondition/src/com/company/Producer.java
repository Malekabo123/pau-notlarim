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
public class Producer implements Runnable {
    
    
    private final static Random generator=new Random();
    
    private final Buffer sharedLocation;
    
    
    public Producer(Buffer shared)
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
              
              sharedLocation.set(count);
              sum+=count;
              //System.out.printf("\t%2d\n",sum);
              
              
          } catch (InterruptedException ex) {
              Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
          }
        
      }
      
      System.out.printf("Producer TERMINATING SUM is"+sum+"\n");
    
    }
}
