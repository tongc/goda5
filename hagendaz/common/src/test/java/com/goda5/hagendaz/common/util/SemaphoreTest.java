package com.goda5.hagendaz.common.util;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    Semaphore binary = new Semaphore(3);
  
    public static void main(String args[]) {
        final SemaphoreTest test = new SemaphoreTest();
        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();
      
        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();
        
        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();
        
        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();
        
        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();
    }
  
    private void mutualExclusion() {
        try {
            binary.acquire();

            //mutual exclusive region
            System.out.println(Thread.currentThread().getName() + " inside mutual exclusive region");
            Thread.sleep(1000);

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            binary.release();
            System.out.println(Thread.currentThread().getName() + " outside of mutual exclusive region");
        }
    }
}
