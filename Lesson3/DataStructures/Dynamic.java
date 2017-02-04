import java.util.ArrayList;
import java.util.HashMap;

public class Dynamic {
    
    public static void main(String[] args) throws Exception {

        System.out.println("----Dynamic Structures----\n");

        //ArrayList
        System.out.println("Empty ArrayList:");
        ArrayList<String> dynamiclist = new ArrayList<String>();
        System.out.println(dynamiclist);

            System.out.println("\nAdd an element to the ArrayList:");
        dynamiclist.add("I'm Dynamic");
        System.out.println(dynamiclist);
            System.out.println("My size: " + dynamiclist.size());

            System.out.println("\nAdd a second element to the ArrayList:");
        dynamiclist.add("I'm Growing");
        System.out.println(dynamiclist);
            System.out.println("My size: " + dynamiclist.size());


        //String Pool
            System.out.println("\n\nCreating String I'm Growing and another one");
        String grow = "I'm Growing", other = "other";
            System.out.println("== compare the direction (pointer) of a Object");
        System.out.println( grow == dynamiclist.get(1) );
        System.out.println( other == dynamiclist.get(1) );
            System.out.println("The two strings has the same value so,\nthe String Pool of JVM assign the same direction to both strings\n\n\n\n");
        


        
        

        //HashMap
            System.out.println("Empty HashMap:");
        HashMap<Integer,String> map = new HashMap<Integer,String>();
            System.out.println(map);
        map.put(10,"I'm Dynamic");
            System.out.println(map);
        map.put(25,"I'm Growing");
            System.out.println(map);

        //String Pool
            System.out.println("\n\nSee doesn't matter on what Structure the String are stored");
            System.out.print("String I'm Growing: ");
        System.out.println( dynamiclist.get(0) == map.get(10) );
            System.out.print("String I'm Dynamic: ");
        System.out.println( dynamiclist.get(1) == map.get(25) );
            System.out.println("they all are just a referece to the String Pool");
        
    }
}