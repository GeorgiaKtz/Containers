# Containers
This Java program simulates a simplified container shipping system. It features:
- Two types of containers: **Bulk Containers** and **Refrigerator Containers**.
- A **Ship** class that can load these containers.
- A **ChargeCalculator** for calculating shipping costs based on container type and properties.
---

## 🚢 Structure
# Class 1. `Main.java`
The entry point of the application. It:
- Creates instances of the containers
- Adds them to the ship
- Displays their shipping charges and information
  
# Class 2. `container.java`
An abstract base class that defines the common properties of all containers, such as:
- Container ID
- Weight
- Owner name
It also defines abstract methods to be implemented by specific container types.

# Class 3. `bulkcontainer.java`
Inherits from `container` and represents a standard bulk container used for general cargo.

# Class  4. `refridgeratorcontainer.java`
Inherits from `container` and represents a temperature-controlled container used for transporting perishable goods.

# Class 5. `Ship.java`
Represents a cargo ship that:
- Has a name and maximum capacity
- Can store multiple containers
- Calculates total load and checks capacity before adding new containers

# Class 6. `ChargeCalculator.java`
Contains static methods to calculate the shipping charge for each container type based on their attributes.

---
## 💡 Features
- Object-Oriented Design using **inheritance**, **abstraction**, and **polymorphism**
- Easy extension for additional container types
- Basic capacity management logic for the ship
- Simple cost calculation system

---
## ✅ How to Run
1. Compile all Java files:
   ```bash
   javac *.java
   ```

2. Run the main program:
   ```bash
   java Main
   ```
---
## 📌 Example Output
```
Container REFR-001 added to ship Poseidon.
Container BULK-001 added to ship Poseidon.
Charge for REFR-001: $350.0
Charge for BULK-001: $100.0
```
---
## 🧪 Requirements
- Java SE 8 or newer
---
## 📁 Author
This project was created as a Java OOP exercise to simulate container loading in maritime logistics.



