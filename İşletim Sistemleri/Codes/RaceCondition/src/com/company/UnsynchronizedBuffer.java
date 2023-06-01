/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author acar
 */
public class UnsynchronizedBuffer implements Buffer {
    
    private int buffer=-1;
    
    
    public void set(int value)
    {
        System.out.printf("Producer writes\t%2d\n",value);
        buffer=value;
    
    }
    
    public int get()
    {
      System.out.printf("Consumer reads\t%2d\n",buffer);
      return buffer;
    }
    
}
