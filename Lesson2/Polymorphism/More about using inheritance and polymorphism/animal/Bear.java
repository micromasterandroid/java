package animal;

public class Bear extends Animal {
    public String color;
    
    public Bear (String c) {
        super();
        color = c;
    }
    
    public void eat () {
        super.eat();
        System.out.println("The bear went fishing before eating.");
    }
}