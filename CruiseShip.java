public class CruiseShip extends Ship
{
   // Initialize MAX_PASSENGERS to hold the number of max passengers
   public static int MAX_PASSENGERS;
   
   // No-arg constructor
   public CruiseShip() {}
   
   /*
   Constructor
   MAX_PASSENGERS The max number of passengers.
   */
   
   public CruiseShip(String shipName, String yearBuilt, int MAX_PASSENGERS) {
   
      super(shipName, yearBuilt);
      this.MAX_PASSENGERS = MAX_PASSENGERS;
      
   }
   
   // Method to set the number of max passengers.   
   public void setMaxPassengers(int MAX_PASSENGERS)  {
   
      MAX_PASSENGERS = MAX_PASSENGERS;
      
   }
   
   // Method to get the number of max passengers.   
   public int getMaxPassengers(int MAX_PASSENGERS) {
      
      return MAX_PASSENGERS;
      
   }
   
   // Override the superclass toString. Display the ship's name and the max number of passengers.
   @Override
   public String toString() {  
   
      return "\nShip Name: " + shipName + "\nMax. Number of Passengers: " + MAX_PASSENGERS;
      
   }
}  
   