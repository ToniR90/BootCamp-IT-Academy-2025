# 🚗 Java Exercise: `Car` Class – Understanding `static`, `final`, and `static final`

## 📚 Objective

The purpose of this exercise is to implement a Java class that demonstrates the differences between the `static`, `final`, and `static final` modifiers. Additionally, it provides practice with static and instance methods in Java.

---

## 🛠️ Class Requirements

Create a class named `Car` with the following attributes:

- `brand` → declared as `static final`: a constant shared by all instances.
- `model` → declared as `static`: a field shared across all instances.
- `power` → declared as `final`: a field that must be assigned once and cannot be changed.

**Note:** Consider which of these fields can be initialized through the constructor.

---

## 🧪 Method Requirements

Add the following methods to the `Car` class:

- `static String brake()`:  
  Prints the message: `"The car is braking"`

- `String accelerate()`:  
  Prints the message: `"The car is accelerating"`

---

## 🧵 Example Usage (Main Class)

```java
public class Main {
    public static void main(String[] args) {
        Car.brake(); // Static method: called without creating an instance

        Car car = new Car("Model S", 500);
        car.accelerate(); // Non-static method: requires an instance
    }
}
```

---

## 📘 Summary of Concepts

| Modifier       | Description                                          | Can be set via constructor? |
|----------------|------------------------------------------------------|------------------------------|
| `static`       | Belongs to the class, not to any specific instance   | ❌ No                         |
| `final`        | Value cannot be changed once initialized             | ✅ Yes                        |
| `static final` | Constant value shared across all instances           | ❌ No (must be initialized at declaration or in a static block) |

---

## 🎯 Learning Goals

- Understand the behavior and differences between `static`, `final`, and `static final`.
- Recognize which fields can be initialized in a constructor.
- Practice invoking static and instance methods appropriately in Java.