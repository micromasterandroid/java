public class Main{
  public static void main(String[] args) {
    String [][] pets = new String[2][3];

    pets[0][0] = "French poodle";
    pets[0][1] = "Boxer";
    pets[0][2] = "Chihuahua";

    pets[1][0] = "British shorthair";
    pets[1][1] = "Himalayan";
    pets[1][2] = "Siberian";

    for (int type = 0; type<pets.length; type++){
      for (int breed = 0; breed < pets[type].length; breed++) {
          System.out.println(pets[type][breed]);
      }
    }
  }
}
