package com.nabenik;

/**
 *
 * @author tuxtor
 */
public class Main {
    
    /**
     * Java old days demonstration
     */
    public void doItInTheOldWay(){
        MyFunctionalInterface objImplementation = new MyFunctionalInterface() {
            @Override
            public void doSomethingFunctional(String txt) {
                System.out.println(txt);
            }
        };
        objImplementation.doSomethingFunctional("Hello in the old way");
    }
    
    public void doItWithLambdas(){
        MyFunctionalInterface objImplementationOne = (String x) -> System.out.println(x);
        objImplementationOne.doSomethingFunctional("Hello from lambda fashion");
        
        MyFunctionalInterface objImplementationTwo = x -> System.out.println(x);
        objImplementationTwo.doSomethingFunctional("Hello from short syntax");
        
        MyFunctionalInterface objImplementationThree = x -> {
            objImplementationTwo.doSomethingFunctional("Hello from complex syntax");
            System.out.println(x);
            System.out.println("Bye from complex syntax");
        };
        objImplementationThree.doSomethingFunctional("Regular code in complex syntax");
        doSomethingHighOrder(objImplementationThree);
    }
    
    public void doSomethingHighOrder(MyFunctionalInterface behaviour){
        behaviour.doSomethingFunctional("in high order way");
    }
    
    public static void main(String[] args){
        Main mainInstance = new Main();
        //Calling the old implementation
        //mainInstance.doItInTheOldWay();
        mainInstance.doItWithLambdas();
        
        MyFunctionalInterface aBehaviour = System.out::println;
        mainInstance.doSomethingHighOrder(aBehaviour);
        
        MyFunctionalInterface bBehaviour = x -> {
            x = "Doing something ".concat(x);
            System.out.println(x);
            System.out.println("Making java great again");
        };
        mainInstance.doSomethingHighOrder(bBehaviour);
    }
    
}
