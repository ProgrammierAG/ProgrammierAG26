# Eigene Klassen

Eine Klasse ist ein von `Main` abgekapselter Bereich. Normalerweise erstellt man für eine Klasse eine Extra Datei, es ist aber auch möglich sie außerhalb der Main aber in derselben Datei zu erstellen. Diese Klasse ist wie ein Bauplan. Zum Beispiel bei der Klasse Auto könnte man Eigenschaften wie `Marke`, `Modell`, `Verbrauch`, `Tankkapazität`usw bestimmt werden. In dieser Klassen werden dann in der Regel mehrere Funktionen wie `Tanken`, `Fahrsimulation` oder `Reichweitenberechnung` berechnet werden anhand der vorher gesetzten Eigenschaften `Verbrauch` sowie `Tankkapazität`. So kann man für jedes Auto individuell diese Berechnung machen das ist der vorher angesprochenen Bauplan.

---
## Attribute bestimmen
Als Erstes werden Eigenschaften / Attribute in der Klasse deklariert. Das `Private` sagt dabei aus, dass man auf dieses Attribut nur innerhalb der Klasse zugreifen kann, also bsp. von Main aus kann man nicht direkt etwas ändern. Dafür müssen Getter und Setter benutzt werden.
```java
private String brand;
private double consumption;
```
---

## Konstruktoren
Diese werden genutzt, um die oben deklarierten Attribute zu initialisieren. Dort gibt es die Möglichkeit des Standardkonstruktors, bei dem Standardwerte gesetzt werden und dem Parameterkonstruktor bei dem spezifische Werte gesetzt werden können. Außerdem heißt der Konstruktor immer gleich wie die Klasse!

#### Standardkonstuktor / Primary Constructor
```java
public Car() {
    brand = "";
    model = "";
    consumption = 0.0;
    fuelCapacity = 0.0;
    currentFuel = 0.0;
}
```
#### Parameterkonstruktor / Parameterized Constuctor
```java
public Car(String brand, String model, double consumption, double fuelCapacity, double currentFuel){
    this.brand = brand;
    this.model = model;
    this.consumption = consumption;
    this.fuelCapacity = fuelCapacity;
    this.currentFuel = currentFuel;
}
```
Das `this` im Code oben sagt nur aus, dass das Attribut der Klasse und nicht der Übergabeparameter gemeint ist also steht dort im Prinzip: Attribut(Brand) = Übergabeparameter(Brand).
Wann welcher der beiden Konstruktoren genutzt wird, entscheidet sich durch den Aufruf der Klasse `Car` in `Main`.

#### Standardkonstruktor aufruf
```java
Car car1 = new Car();
```
#### Parameterkonstruktor aufruf
```java
Car car2 = new Car("Porsche", "GT3 RS", 10.7, 64, 20);
```

---

## Getter und Setter
Getter und Setter dienen dazu, die Attribute einer Klasse abzufragen oder zu ändern. Da die Attribute meist `private` sind kann man nur über die Getter und Setter die Attribute steuern. Getter und Setter sind Methoden welche entweder ein Attribut setzen (SET) oder zurückgeben (GET). A simple IntelliJ feature is to create Getter and Setter by pressing `ALT + insert`.

#### Getter
```java
public String getBrand(){
    return brand;
}
```
#### Setter
```java
public void setBrand(String brand){
    this.brand = brand;
}
```

Es gibt möglichkeiten solche Getter und Setter zu vereinfachen jedoch werden dazu Dependencies gebraucht. Diese Erweiterungen jeglicher Art werden von externen gemacht, um uns das Leben einfacher zu machen. Dazu müssen wir die Erweiterungen in unser Projekt einbinden und in die jeweilige File importieren. Diese Dependencies können Annotations sein also über eine Klasse, Methode, Variable ein @[Annotation_Name] wie in unserem Beispiel @Getter / @Setter.

```java
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    //Code
}
```
