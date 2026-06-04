# Racing Simulation

Object-oriented Java engine simulating vehicle physics and race mechanics.
Encapsulation, inheritance, and state management demonstration.

## Architecture

Each simulation tick runs three phases per car:

1. **Acceleration** — speed increases by a random factor (0-9 km/h).
2. **Turbo check** — 20% chance of a 1.4x speed multiplier.
3. **Speed cap** — speed clamped to the car's `vMax`.

`F1Car` extends `Car` with a DRS mechanic: an additional 5% top-end boost applied
after the base speed update.

## Prerequisites

- JDK 17+

## Quickstart

```bash
javac src/RacingCars/*.java -d out/
java -cp out/ racingcars.Main
```

## Example Output

```
=== Racing Simulation ===

--- Tick 1 ---

--- Car Telemetry ---
Driver: Joseph
Vehicle: McLaren P1 (Orange)
Current Speed: 10.50 km/h
Position: 10.50

--- Car Telemetry ---
Driver: Hamilton
Vehicle: Ferrari SF-24 (Red)
Current Speed: 14.00 km/h
Position: 14.00
...
=== Race Finished ===
```
