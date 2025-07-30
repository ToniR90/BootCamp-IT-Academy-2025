# Musical Instruments Exercise

## 📚 Description

In this exercise, we model a group of musical instruments using inheritance and polymorphism in Java.

There are three main types of musical instruments:

- **Wind instruments**
- **String instruments**
- **Percussion instruments**

All instruments share the following common characteristics:

- **Attributes**:
  - `name` (String)
  - `price` (double)

- **Method**:
  - `play()`: An abstract method defined in the base class `Instrument`, which must be implemented in each subclass.

Each subclass provides a specific implementation of the `play()` method:

- **Wind**: prints `"A wind instrument is playing"`  
- **String**: prints `"A string instrument is playing"`  
- **Percussion**: prints `"A percussion instrument is playing"`

---

## 🧠 Learning Goals

- Understand how **inheritance** and **polymorphism** work in Java.
- Practice using **abstract classes** and **method overriding**.
- Learn about **class loading** and how it's triggered in Java.
- Explore the use of **initialization blocks** and **static blocks**.

---

## 🧪 Static and Initialization Blocks

In Java, a class is only **loaded once** by the JVM. This loading can happen when:

- An object of that class is created.
- A static member (field or method) of the class is accessed.

This exercise demonstrates how class loading works by using:

### ✅ Static block
Executed **only once** when the class is loaded.

```java
static {
    System.out.println("Static block: Class is being loaded");
}
```

### ✅ Instance inizialitation block

```java
{
    System.out.println("Initialization block: An instance is being created");
}
```

### Requirements

- Java 8 or higher


### 🚀 How to Run

1. Compile the project:
```
javac instruments/*.java
```

2. Run the main class:
```
java instruments.Main
```