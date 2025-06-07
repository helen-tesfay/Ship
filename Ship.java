public class Ship {     // Superclass
 
  public static String shipName;       // Initialize shipName
  public static String yearBuilt;      // Initialize yearBuilt

  // No-arg constructor
  public Ship() {}
  
  /* Constructor
  shipName The name of the Ship
  yearBuilt The year that the ship was built on
  */

  public Ship(String shipName, String yearBuilt) {
  
    this.shipName = shipName;
    this.yearBuilt = yearBuilt;
    
  }

  // shipName mutator/setter
  public void setShipName(String shipName) {
   
    shipName = shipName;
   
  }
 
  // shipName accessor/getter
  public String getShipName() {
   
    return shipName;
   
  }
 
  // yearBuilt mutator/setter
  public void setYearBuilt(String yearBuilt) {
   
    yearBuilt = yearBuilt;
   
  }
 
  // yearBuilt accessor/getter
  public String getYearBuilt() {
   
    return yearBuilt;
   
  }
  
  // String to print shipName and yearBuilt
  public String toString() {
  return "\nShip Name: " + shipName + "\nYear Built: " + yearBuilt;
  }
 
}