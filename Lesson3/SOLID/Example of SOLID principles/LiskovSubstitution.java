import java.util.ArrayList;

public class LiskovSubstitution {
    public static void main(String[] args) throws Exception {
        PetShopInfoCenter.addProduct(
            new Dog(180, 100, 15, "If you Adopt Supplies are Free")
        );
        PetShopInfoCenter.addProduct(
            new Fish(15, 15)
        );

        System.out.println(PetShopInfoCenter.generateCatalogue());
    }
}

final class PetShopInfoCenter {
    private static ArrayList<Animal> productCatalogue = new ArrayList<Animal>();

    public PetShopInfoCenter() {
        ;
    }

    public static void addProduct(Animal pet) {
        productCatalogue.add(pet);
    }

    public static String generateCatalogue(){
        String catalogue = "";
        
        for (Animal pet: productCatalogue) {
            catalogue += pet.getName() + ":\n\t" +
                        pet.getCompletePrice() +
                        "\n\t" + pet.getExtraSupplies() +
                        "\n\t" + pet.getBuyOptions() + "\n\n";
        }

        return catalogue;
    }
}

//Father Class
abstract class Animal {
    private String name;
    private int baseprice, suppliesprice;

    public Animal(String name, int baseprice, int suppliesprice) {
        this.name = name;
        this.baseprice = baseprice;
        this.suppliesprice = suppliesprice;
    }

    public String getName() {
        return this.name;
    }
    public String getCompletePrice() {
        return "Animal Price: $" + this.baseprice + ".00 + Supplies Price: $" + this.suppliesprice +
                ".00\n\tTotal Price: $" + (this.baseprice + this.suppliesprice) + ".00";
    }

    public abstract String getExtraSupplies();
    public abstract String getBuyOptions();
}

//Child Class
class Dog extends Animal {
    private String otherrelateddata;
    private int obligatorySuppliesprice, optionalSuppliesprice;
    public Dog(int baseprice, int obligatory, int optional, String otherrelateddata) {
        super("Dog", baseprice, obligatory + optional);
        this.otherrelateddata = otherrelateddata;
        this.obligatorySuppliesprice = obligatory;
        this.optionalSuppliesprice = optional;
    }

    public String getExtraSupplies(){
        return "\tObligatory: Vaccines, Food 50kg\t($"+
                this.obligatorySuppliesprice+
                ".00)\n\t\tOptional: dog collar & harness\t($"+
                this.optionalSuppliesprice+".00)";
    };

    public String getBuyOptions(){
        return "Breeds: Golden Retriever, Schnauzer, Husky\n\t" + this.otherrelateddata;
    };
}

//Child Class
class Fish extends Animal {
    public Fish(int baseprice, int suppliesprice) {
        super("Fish", baseprice, suppliesprice);
    }

    public String getExtraSupplies(){
        return "\tFishbowl, Food, Fungicide Drops";
    };

    public String getBuyOptions(){
        return "Breeds: Beta, Koi, Angel\n\t";
    };
}