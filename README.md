<!-- PROJECT LOGO -->
<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="100"/>
</p>

<h1 align="center">🚗 Java OOP - Automobile Interface</h1>

<p align="center">
  A practical demonstration of <b>Interfaces and Polymorphism</b> in Java.<br/>
  Learn OOP concepts through a simple car simulation.
  <br/><br/>
  <a href="https://github.com/LesbatHaithem/Car"><strong>🔗 Explore the project »</strong></a>
  <br/><br/>
  <img src="https://img.shields.io/badge/Java-8+-blue?style=for-the-badge&logo=openjdk"/>
  <img src="https://img.shields.io/badge/OOP-Interface-green?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Polymorphism-Core-orange?style=for-the-badge"/>
</p>

---

## 📘 Overview

This project demonstrates **Object-Oriented Programming** concepts through a car simulation where a **Conducteur (Driver)** can start and stop different types of automobiles (`R4` and `BMW`) using a shared **Automobile** interface.

**Key Concepts:**
- 🎯 Interface implementation
- 🔄 Polymorphism
- 🏗️ Class interaction
- 📦 Abstraction

---

## 🧩 Project Structure

### 🔹 Class: `Car`

Base car class with make, model, and year:

```java
package Car;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ")";
    }
}
```

---

### 🔹 Interface: `Automobile`

Defines the common behavior for all cars:

```java
public interface Automobile {
    void demarrer();  // Start the car
    void arreter();   // Stop the car
}
```

---

### 🔹 Class: `R4`

Implements the `Automobile` interface for a Renault 4 car:

```java
public class R4 implements Automobile {
    @Override
    public void demarrer() {
        System.out.println("La R4 démarre.");
    }
    
    @Override
    public void arreter() {
        System.out.println("La R4 s'arrête.");
    }
}
```

---

### 🔹 Class: `BMW`

Implements the `Automobile` interface for a BMW car:

```java
public class BMW implements Automobile {
    @Override
    public void demarrer() {
        System.out.println("La BMW démarre.");
    }
    
    @Override
    public void arreter() {
        System.out.println("La BMW s'arrête.");
    }
}
```

---

### 🔹 Class: `Conducteur`

Driver class that can control any `Automobile`:

```java
public class Conducteur {
    
    public void demarrerVehicule(Automobile voiture) {
        voiture.demarrer();
    }
    
    public void arreterVehicule(Automobile voiture) {
        voiture.arreter();
    }
}
```

---

### 🔹 Class: `Civilite`

Utility class for title/civility (demonstration of static instances):

```java
public class Civilite { 
    static Civilite mme = new Civilite();   // Madame
    static Civilite mr = new Civilite();    // Monsieur
    static Civilite mlle = new Civilite();  // Mademoiselle
}
```

---

## 🎯 Usage Example

```java
public class Test {
    public static void main(String[] args) {
        // Create a driver
        Conducteur c = new Conducteur();
        
        // Create different cars
        Automobile a = new R4();
        Automobile b = new BMW();
        
        // Drive R4
        c.demarrerVehicule(a);
        c.arreterVehicule(a);
        
        // Drive BMW
        c.demarrerVehicule(b);
        c.arreterVehicule(b);
    }
}
```

**Output:**
```
La R4 démarre.
La R4 s'arrête.
La BMW démarre.
La BMW s'arrête.
```

---

## 📂 Files Structure

```
Car/
│
├── Car.java            # Base car class with make/model/year
├── Automobile.java     # Interface defining car behavior
├── R4.java            # Renault 4 implementation
├── BMW.java           # BMW implementation
├── Conducteur.java    # Driver class
├── Civilite.java      # Title/civility utility class
├── Test.java          # Demo application
└── README.md          # This file
```

---

## 🚀 Getting Started

### Prerequisites
- **Java 8+**
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### Running the Project

```bash
# Clone the repository
git clone https://github.com/LesbatHaithem/Car.git
cd Car

# Compile
javac *.java

# Run
java Test
```

---

## 🎓 OOP Concepts Demonstrated

### 1️⃣ **Interface**
The `Automobile` interface defines a contract that all car classes must follow:
```java
public interface Automobile {
    void demarrer();
    void arreter();
}
```

**Benefits:**
- Defines common behavior
- Enables polymorphism
- Loose coupling

---

### 2️⃣ **Polymorphism**
A `Conducteur` can drive any `Automobile` without knowing its specific type:
```java
Conducteur c = new Conducteur();
Automobile a = new R4();   // R4
Automobile b = new BMW();  // BMW

c.demarrerVehicule(a);  // Works with any Automobile
c.demarrerVehicule(b);  // Works with any Automobile
```

---

### 3️⃣ **Implementation**
Each car class provides its own implementation:
```java
// R4 implementation
public void demarrer() {
    System.out.println("La R4 démarre...");
}

// BMW implementation
public void demarrer() {
    System.out.println("La BMW démarre avec puissance!");
}
```

---

### 4️⃣ **Method Parameters**
`Conducteur` uses method parameters instead of storing the car:
```java
public class Conducteur {
    public void demarrerVehicule(Automobile voiture) {
        voiture.demarrer();
    }
}
```

**Benefit:** More flexible - can work with any car without storing it.

---

## 📊 Class Diagram

```
┌─────────────────┐
│   Automobile    │ (Interface)
├─────────────────┤
│ + demarrer()    │
│ + arreter()     │
└─────────────────┘
        △
        │ implements
   ┌────┴────┐
   │         │
┌──▼──┐   ┌──▼──┐
│ R4  │   │ BMW │
├─────┤   ├─────┤
│ ... │   │ ... │
└─────┘   └─────┘

┌──────────────┐
│ Conducteur   │
├──────────────┤
│ - voiture    │◆──────> Automobile
├──────────────┤
│ + conduire() │
└──────────────┘
```

---

## 💡 Key Takeaways

✅ **Interfaces define contracts** - All implementations must follow the same behavior  
✅ **Polymorphism enables flexibility** - One driver can control different car types  
✅ **Loose coupling** - Driver doesn't need to know car implementation details  
✅ **Code reusability** - Easy to add new car types without changing driver code  

---

## 🧭 Extending the Project

Ideas to enhance this project:

🚀 Add more car types (Tesla, Mercedes, etc.)  
⛽ Add fuel management (refuel method)  
🏎️ Add speed control (accelerer, ralentir)  
🔧 Add maintenance features (reparer method)  
📍 Add GPS navigation  

**Example:**
```java
public interface Automobile {
    void demarrer();
    void arreter();
    void accelerer(int vitesse);
    void refuel(double litres);
}
```

---

## 📚 Resources

- [Oracle Java Interfaces Tutorial](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- [Polymorphism in Java](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

## 👨‍💻 Author

**Haithem Lesbat**  
[GitHub](https://github.com/LesbatHaithem) | [LinkedIn](https://www.linkedin.com/in/haithem-lesbat)

---

<p align="center">
  Made with ❤️ for learning Java OOP
</p>