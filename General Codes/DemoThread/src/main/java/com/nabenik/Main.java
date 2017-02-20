package com.nabenik;

/**
 *
 * @author tuxtor
 */
public class Main {
    
    
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new ThreadObject();
        Thread thread2 = new Thread(new ThreadAltObject());
    
        //thread1.start();
        thread2.start();
        
        //Thread.sleep(500);
        //thread1.interrupt();
        //thread2.interrupt();
        thread2.join();
        System.out.println("Main thread will continue");
    }
    
}
