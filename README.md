# 🚗 Java OOP Project — Interface & Classes (Automobile, R4, BMW, Conducteur)

## 📘 Overview
This project is a simple Java exercise created to **learn and apply Object-Oriented Programming (OOP)** concepts such as **interfaces, polymorphism, and class interaction**.

It simulates a small scenario where a **driver (Conducteur)** can start and stop different types of cars (`R4` and `BMW`) through a shared **Automobile** interface.

---

## 🧩 Classes and Structure

### 🔹 Interface: `Automobile`
Defines the common behavior of all automobiles.  
It contains two abstract methods:
```java
void demarrer();
void arreter();
