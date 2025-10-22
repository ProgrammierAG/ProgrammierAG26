package aufgabe00;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
  private String brand;
  private String model;
  private double consumption;
  private double fuelCapacity;
  private double currentFuel;

  public Car(){
    brand = "";
    model = "";
    consumption = 0.0;
    fuelCapacity = 0.0;
    currentFuel = 0.0;
  }

  public Car(String brand, String model, double consumption, double fuelCapacity, double currentFuel){
    this.brand = brand;
    this.model = model;
    this.consumption = consumption;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = currentFuel;
  }

  public void GetInfo(){
    System.out.println("Brand: " + brand + "\nModel: " + model + "\nConsumption: " + consumption + "\nTank capacity: " + fuelCapacity);
  }

  public double DrivingSimulation(double distance){
    double fuelForDistance = distance / 100 * consumption;
    if(currentFuel >= fuelForDistance){
      currentFuel -= fuelForDistance;
    }else{
      System.out.println("Achtung du wirst die Strecke nicht schaffen deshalb wurde die Fahrt abgebrochen!");
    }
    return currentFuel;
  }

  public double FuelUp(double fuelInput){
    if(fuelInput + currentFuel <= fuelCapacity){
      currentFuel += fuelInput;
    }else{
      currentFuel = fuelCapacity;
    }
    return  currentFuel;
  }

  public double CalculateDistance(){
    return currentFuel / consumption * 100;
  }
}
