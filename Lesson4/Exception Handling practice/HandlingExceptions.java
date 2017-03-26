
public class HandlingExceptions {

   public static void main(String [] args) throws Exception{
      //Limit $2000.00
      CreditCard card = new CreditCard(62656565,2000.0);
      System.out.println("Credit Card State:");
      System.out.println(card.getCreditState());
      
      
      try {
         System.out.println("\n\tBuying $1500.00");
         card.buy(1500.00);

         System.out.println("\nCredit Card State:");
         System.out.println(card.getCreditState());

         System.out.println("\n\tBuying $800.00\n");
         card.buy(800.00);
      }catch(ExceededCreditCardLimitException e) {
         System.out.println("Invalid Buy, Limit Exceeded by " + e.getExceededAmount());
         e.printStackTrace(); //Print Stack Trace
      }
   }
}

class CreditCard {
   private double creditavailable, limit;
   private int number;
   
   public CreditCard(int number, double limit) {
      this.number = number;
      this.creditavailable = limit;
      this.limit = limit;
   }
   
   public void paidCreditCard(double amount) {
      creditavailable += amount;
   }
   
   public void buy(double amount) throws ExceededCreditCardLimitException {
      if(amount <= creditavailable) {
         this.creditavailable -= amount;
      }else {
         double exceeded = amount - creditavailable;
         throw new ExceededCreditCardLimitException(exceeded);
      }
   }

   public String getCreditState(){
       return "Credit Available: $" + this.creditavailable + " Credit Limit: $" + this.limit;
   }
   
   public double getCreditAvailable() {
      return this.creditavailable;
   }
   
   public double getLimit() {
      return this.limit;
   }

   public int getNumber() {
      return this.number;
   }
}

class ExceededCreditCardLimitException extends Exception {
   private double exceededamount;
   
   public ExceededCreditCardLimitException(double exceededamount) {
      this.exceededamount = exceededamount;
   }
   
   public double getExceededAmount() {
      return exceededamount;
   }
}