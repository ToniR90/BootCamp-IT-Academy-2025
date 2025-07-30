# 📱 Java Exercise: `Smartphone` Inheriting from a Class and Implementing Multiple Interfaces

## 📚 Objective

The goal of this exercise is to practice:

- Class inheritance in Java
- Implementation of multiple interfaces
- Method overriding
- Calling methods from the `main()` method

---

## 🛠️ Requirements

### 1. Create a class named `Phone` with:

- **Attributes:**
  - `brand`
  - `model`
- **Method:**
  - `call(String number)`:  
    Prints: `"Calling number: <number>"`

---

### 2. Create two interfaces:

- `Camera`:
  - Method: `takePhoto()`
- `Clock`:
  - Method: `alarm()`

---

### 3. Create a class named `Smartphone` that:

- **Extends** the `Phone` class
- **Implements** both `Camera` and `Clock` interfaces
- **Overrides methods** as follows:
  - `takePhoto()` → Prints: `"Taking a photo"`
  - `alarm()` → Prints: `"Alarm is ringing"`

---

## 🧪 Example Usage in `main()`

```java
public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung", "Galaxy S24");

        myPhone.call("123-456-7890");     // Calling method from Phone
        myPhone.takePhoto();              // Calling method from Camera
        myPhone.alarm();                  // Calling method from Clock
    }
}
```

---

## 🔄 Class & Interface Structure

```plaintext
           Phone
             ▲
             |
       +-------------+
       | Smartphone  |
       +-------------+
         /        \
   Camera       Clock
```

---

## 🎯 Learning Goals

- Understand how to combine class inheritance and interface implementation
- Learn how to override methods from interfaces
- Practice passing parameters to methods
- Get comfortable with Java syntax for `extends` and `implements`

---

Happy coding! ☕