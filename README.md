# 🎬 MovieInfoApp

**MovieInfoApp** is a simple Java project built to demonstrate the concept of **Encapsulation**.
It simulates a movie information system where each movie has private attributes such as its name, price, and age limit.
The data can only be accessed or modified through **getter** and **setter** methods that include **validation logic**.

---

## 🚀 Features

* Demonstrates **Encapsulation** in Java
* Uses **private fields** and **public getters/setters**
* Includes **constructor initialization**
* Built-in **data validation** for negative or invalid values
* Provides a `showInfo()` method for formatted display of movie details

---

## 🧠 Concepts Covered

* Encapsulation (data hiding)
* Access modifiers
* Constructors
* Getters and Setters
* Input validation
* Object-oriented design fundamentals

---

## 📂 Project Structure

```
MovieInfoApp/
 ├── src/
 │    ├── Ankara.java   # Defines the Ankara class
 │    └── tekin.java          # Main class to test functionality
 └── README.md
```

---

## 🧩 Example Code

```java
public class Ankara {
    private String movieName;
    private int ageLimit;
    private double price;

    public Ankara(String movieName, int ageLimit, double price) {
        setMovieName(movieName);
        setAgeLimit(ageLimit);
        setPrice(price);
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        if (ageLimit < 0) {
            System.out.println("⚠️ Age limit cannot be below 0!");
        } else {
            this.ageLimit = ageLimit;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("⚠️ Price cannot be negative!");
        } else {
            this.price = price;
        }
    }

    public void showInfo() {
        System.out.println("🎬 Movie Name: " + movieName);
        System.out.println("🔞 Age Limit: " + ageLimit);
        System.out.println("💰 Price: " + price + "€");
    }
}
```

**Main.java**

```java
public class tekin {
    public static void main(String[] args) {
        MovieTicket movie = new MovieTicket("WISH YOU WERE HERE", 7, 40);

        movie.setPrice(-5);      // Invalid value, prints warning
        movie.setAgeLimit(-10);  // Invalid value, prints warning

        movie.showInfo();        // Displays current movie info
    }
}
```

---

## 🧭 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/<your-username>/MovieInfoApp.git
   ```
2. Navigate to the project folder:

   ```bash
   cd MovieInfoApp/src
   ```
3. Compile and run:

   ```bash
   javac Ankara.java tekin.java
   java tekin
   ```

---

## 💡 Future Improvements

* Add multiple movie objects in an array or list
* Include user input with `Scanner`
* Implement a simple menu-driven system
* Extend it to a basic Cinema Management System

---

## 👨‍💻 Author

**Your Name (Tekin Never Broke Again)**
Java Learner & Beginner Developer(Since 2 weeks) 
📍 Germany
📧 [tekinemre229@gmail.com](mailto:tekinemre229@gmail.com)
