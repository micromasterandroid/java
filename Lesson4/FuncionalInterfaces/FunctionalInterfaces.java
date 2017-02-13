import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.text.DecimalFormat;

public class FunctionalInterfaces {
    
    public static void main(String[] args) throws Exception {
        //Read from file products.txt the list of products
        //Format: Name Categorie Stock Price

        //Create a new Product List
        List<Product> technologystore;


        //Print each of the products
        //Your Code here


        //Filter and print from the list all the products that are Accesories
        //Your Code here


        //Filter and print from the list all the products that the stock is more or equal to 50
        //Your Code here

        //Filter and print from the list all the products that:
            //are cheaper than $150.00 and
            //has more than 25 in stock
        //Your Code here


        //Remove from the list (don't print) if product:
            //the categorie is Office
        //Your Code here

        //Remove from the list (don't print) if product:
            //has less than 30 in stock
        //Your Code here

        //Remove from the list (don't print) if product:
            //are cheaper than $250.00
        //Your Code here

        


        //Print each of the products that left
        //Your Code here
    }
}

class Product {
    public int id, stock;
    public String name, categorie;
    public float price;
    
    public Product(int id, String name, String categorie, float price, int stock) {
        this.id = id;
        this.name = name;
        this.categorie = categorie;
        this.price = price;
        this.stock = stock;
    }
    
    public String toString(){
        return "";
    }
}