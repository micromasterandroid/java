package com.nabenik;

/**
 *
 * @author tuxtor
 */
public class ThreadAltObject implements Runnable {

    /**@Override
    public void run(){
        System.out.println("Hello from thread 2");
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
                Thread.currentThread().interrupt();
            }
            System.out.println("Count from thread 2 - " + i);
        }
    }**/
    
    @Override
    public void run(){
        System.out.println("Hello from thread 2");
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if(i%10_000_000 == 0){
                System.out.println("Count from thread 2 - " + i);
                
                if(Thread.interrupted()){
                    System.out.println("Thread 2 has been interrupted");
                    break;
                }
            }
        }
    }
    
    
    
}
