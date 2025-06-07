public class CargoShip extends Ship
{
   public int cargoCapacity;        // Initialize Cargo Capacity (counted in tonnage)
   
   public CargoShip() {}            // No-arg constructor 
   
   /*
   Constructor
   shipName The name of the ship.
   yearBuilt The year that the ship was built on.
   cargoCapacity The cargo capacity of the ship.
   */
   public CargoShip(String shipName, String yearBuilt, int cargoCapacity) 
   {
      super(shipName, yearBuilt);
      this.cargoCapacity = cargoCapacity;    // Initialize cargoCapacity
   }
   
   // shipName setter   
   public void setShipName(String shipName)
   {
      shipName = shipName;
   }
   
   // shipName getter
   public String getShipName(String shipName)
   {
      return shipName;
   }

   // cargoCapacity setter
   public void setCargoCapacity(int cargoCapacity)
   {
      this.cargoCapacity = cargoCapacity;
   }
   
   // cargoCapacity getter
   public int getCargoCapacity(int cargoCapacity)
   {
      return cargoCapacity;
   }
   
   // Override the superclass toString. Display the ship's name and cargo capacity.
   @Override
   public String toString()
   {
      return "\nShip Name: " + shipName + "\nCargo Capacity (in tonnage): " + cargoCapacity;
   }
   
}
      
