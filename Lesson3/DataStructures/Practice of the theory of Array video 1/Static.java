import java.util.Arrays;
public class Static {
    
    public static void main(String[] args) throws Exception {
        int intArray[] = new int[3];
        System.out.println("Array of primitive int:");
        System.out.println(Arrays.toString(intArray));
        
        
        Integer integerArray[] = new Integer[3];
        System.out.println("\n\nArray of Integer Object:");
        System.out.println(Arrays.toString(integerArray));
        
        integerArray[0] = new Integer(5);
        System.out.println(Arrays.toString(integerArray));
        
        
        
        Foo fooArray[] = {new Foo(1), new Foo(2), new Foo(3)};
        System.out.println("\n\nArray of Foo Object:");
        System.out.println(Arrays.toString(fooArray));
        
        fooArray[1] = null;
        System.out.println(Arrays.toString(fooArray));
    }
}

class Foo {
    private int id;
    
    public Foo(int id) {
        this.id = id;
    }
    
    //Execute, then Uncomment and execute again
    /*public String toString(){
        return "I'm Foo Object #" + this.id;
    }*/
}