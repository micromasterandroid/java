import java.util.LinkedList;
import java.util.Random;
import java.lang.InterruptedException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class MultiThreading {
    
    public static void main(String[] args) throws Exception {
        Scanner inputReader = new Scanner(System.in);
        String userinput;

        /*Read Movies from movies.txt*/

        /*Create classes*/
        
        /*Start Threads*/

        //Stop with any key, except just Enter
        while(true){
            userinput = inputReader.next();
            /*End Threads*/
            System.exit(0);
        }
    }
}

class Customer {
    
    public Customer(){
        ;
    }

    public String toString(){
        return "";
    }
}

final class MovieTicketsStock {

    private MovieTicketsStock() {
        ;
    }

    public static boolean sellTicket() {
        return false;
    }

    public String toString(){
        return  "";
    }
}

final class MovieQueues {
    private static LinkedList<Customer> movieQueue1 = new LinkedList<Customer>();
    private static LinkedList<Customer> movieQueue2 = new LinkedList<Customer>();
    private static LinkedList<Customer> movieQueue3 = new LinkedList<Customer>();
    private static LinkedList<Customer> movieQueue4 = new LinkedList<Customer>();
    private static LinkedList<Customer> movieQueue5 = new LinkedList<Customer>();

    private MovieQueues() {
        ;
    }
    
    public static void enterCustomer() {
        ;
    }

    public static Customer attendCustomer() {
        return null;
    }

    public String toString(){
        return  "";
    }
}

class Entry extends Thread {
    Random randomgenerator = new Random();
    private static int IDs;
    private boolean threadalive = true;
    
    public Entry() {
        ;
    }

    public void run() {
       
        while(this.threadalive){
            ;
        }
    }

    public void entry(int timecustomerenter){
        ;
    }

    public void end(){
        this.threadalive = false;
    }
}

class Attender extends Thread {
    private boolean threadalive = true;

    public Attender() {
        ;
    }

    public void run() {
        
        while(this.threadalive){
            ;
        }
    }
    public void attend(Customer customer){
        ;
    }

    public void end(){
        this.threadalive = false;
    }
}