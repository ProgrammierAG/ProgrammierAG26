package aufgabe00;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Car car = new Car("Porsche", "GT3 RS", 10.7, 64, 20);
    car.GetInfo();
    System.out.print("Wie weit willst du fahren? Bitte gib die Distanz in km ein: ");
    double drivingDistance = sc.nextDouble();
    double currentFuel = car.DrivingSimulation(drivingDistance);
    System.out.println("Du bist" + drivingDistance + "km gefahren und hast jetzt noch " + currentFuel + "l übrig.");
    System.out.print("Nun solltest du wieder tanken. Wie viel Liter willst du tanken? Liter: ");
    double addedFuel = sc.nextDouble();
    car.FuelUp(addedFuel);
    car.GetInfo();
  }
}
