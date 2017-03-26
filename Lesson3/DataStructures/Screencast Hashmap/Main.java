import java.util.ArrayList;
import java.util.HashMap;


public class Main{
  public static void main(String[] args) {
    /*

    HashMap <Integer, String> months = new HashMap<Integer, String>();
    months.put(1, "January");
    months.put(2, "Februray");
    months.put(3, "March");
    months.put(4, "April");
    months.put(5, "May");
    months.put(6, "June");
    months.put(7, "July");
    months.put(8, "Agust");
    months.put(9, "September");
    months.put(10, "October");
    months.put(11, "November");
    months.put(12, "December");

    System.out.println(months.get(1));
    System.out.println(months.get(12));
    System.out.println(months.get(13)); // This will give you a null value

    */
    HashMap<String, String> countries = new HashMap <String, String>();

    countries.put("GTM", "Guatemala");
    countries.put("USA", "United States of America");
    countries.put("CHN", "China");
    countries.put("ESP", "Spain");

    countries.forEach((code,name)-> System.out.println("code: " + code + "   name: "+ name));
  }
}
