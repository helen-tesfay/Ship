/*
   The Ship project is to store and print information about three ships: a general ship, a cruise ship, and a cargo ship.
   This is the required information:

      General ship:
         - Ship name, year built
         
      Cruise ship:
         - Ship name, year built, maximum passenger capacity
       
      Cargo ship:
         - Ship name, year built, maximum cargo capacity
      
   Project by Helen Tesfay
*/

public class ShipDemo
{
   public static void main(String[] args)
   {
   
   // Create an array for the objects
   Ship[] ships = new Ship[3];
   
   // Create Ship, CruiseShip, and CargoShip objects
   ships[0] = new Ship("The Miracle", "2025");      
   ships[1] = new CruiseShip("The Miracle", "2025", 70000);   
   ships[2] = new CargoShip("The Miracle", "2025", 3000);

   // For-loop to step through each class's toString method
   for (int i = 0; i < ships.length; i++)
   {
      System.out.println(ships[i].toString());  // Display the appropriate information from each class
   }
  }
}  


   
   

   
   

   
   
