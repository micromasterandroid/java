import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.text.DecimalFormat;

public class FunctionalInterfaces {
    
    public static void main(String[] args) throws Exception {
        //Create a new Grocery Store List
            //Arrays.asList: Returns a fixed-size list backed by the specified array
            //To be dynamic use LinkedList
        List<Product> groceryStore = new LinkedList<Product>(
            Arrays.asList(
                new Product(0,"Tomato","Fruit",1.75f),
                new Product(1,"Avocado","Fruit",5f),
                new Product(2,"Lemon","Fruit",0.5f),
                new Product(3,"Onion","Vegetable",1.50f),
                new Product(4,"Carrot","Vegetable",1.25f),
                new Product(5,"Broccoli","Vegetable",2f),
                new Product(6,"Shrimp","Seafood",10.99f),
                new Product(7,"Chicken","Meat",7.35f),
                new Product(8,"Roast Beef","Meat",8.35f)
            )
        );

        //Print each of the products
            System.out.println("Original List:");
        groceryStore.forEach(
            product -> System.out.println(product)
        );



        //Predicate filter of meat categorie
        Predicate<Product> meatRemover =
            (Product product) -> "Meat".equals(product.categorie);
        
        //Remove meat categories
        groceryStore.removeIf(meatRemover);
        //Print each of the products
                System.out.println("\n\nWithout Meat List:");
        groceryStore.forEach(product -> System.out.println(product));



        //Predicate filter of expensive product
        Predicate<Product> expensiveRemover =
            (Product product) -> product.price > 5f;
        
        //Remove expensive product
        groceryStore.removeIf(expensiveRemover);
        //Print each of the products
                 System.out.println("\n\nWithout Expensive & Meat List:");
        groceryStore.forEach(product -> System.out.println(product));



        //Just Filter First Fruit without eliminating the other products
        System.out.println("\n\nFilter First Fruit:");
        System.out.println(
            groceryStore.stream().filter(
                (Product product) -> product.categorie.equals("Fruit")
            ).findFirst()
        );

        //Filter Fruit new List
        System.out.println("\n\nFilter All Fruit:");
        System.out.println(
            groceryStore.stream().filter(
                (Product product) -> product.categorie.equals("Fruit")
            ).collect( Collectors.toList() )
        );

        //Print each of the products
                 System.out.println("\nDon't eliminate the other products just filter:");
        groceryStore.forEach(product -> System.out.println(product));
    }
}

class Product {
    public int id;
    public String name, categorie;
    public float price;
    
    public Product(int id, String name, String categorie, float price) {
        this.id = id;
        this.name = name;
        this.categorie = categorie;
        this.price = price;
    }
    
    public String toString(){
        return ( this.name + (new DecimalFormat(" $0.00")).format(this.price) );
    }
}