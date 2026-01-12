# 🏎️ High-Performance Racing Simulation

> **Object-Oriented Java Engine** designed to simulate real-time vehicle physics and race mechanics.
> *Academic project demonstrating Encapsulation, State Management, and Algorithmic Logic.*

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-green)

## 📖 Overview
This project is a backend simulation engine that models the behavior of competition cars. It does not rely on a GUI; instead, it focuses on the **logic layer**: calculating acceleration vectors, managing random events (Turbo Boosts), and updating object states (Position/Velocity) in real-time.

## ⚙️ Key Features
* **OOP Architecture:** Full use of **Encapsulation** to protect vehicle attributes (Speed, Position, VMax).
* **Probability Logic:** Implements a randomized "Turbo Boost" mechanic with a 20% success probability using `java.util.Random`.
* **State Management:** Dynamic calculation of speed limits and position updates per tick.
* **Clean Code:** Modular design separating Data (Attributes) from Logic (Methods).

## 🛠️ How it Works
The `Cars` class serves as the blueprint for every vehicle entity.
1.  **Acceleration:** In every cycle, the car increases speed by a random factor (0-9 km/h).
2.  **Turbo Check:** The engine checks for a "Lucky Number". If `random < 0.2`, speed is multiplied by **1.4x**.
3.  **Limits:** The system automatically caps speed at the defined `vMax` (Maximum Velocity).

## 🚀 How to Run
1.  Clone this repository.
2.  Open the project in **IntelliJ IDEA**.
3.  Run the `Main.java` file to see the telemetry output in the console.

´´´
# Example Output
Driver: Joseph
Vehicle: McLaren P1 (Orange)
Current Speed: 124.50 km/h
TURBO BOOST ACTIVATED!
´´´
