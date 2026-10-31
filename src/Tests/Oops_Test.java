
	// 1.The concept used is "Encapsulation". The reason is because it combines data and methods into a single class.		
		
	// 2.The OOPs concept that is been used is "Inheritance".
		//Syntax:
//		         class Vehicle {
//	             void start() {
//	             System.out.println("Vehicle");
//	                }
//	              }
//
//	              class Car extends Vehicle {
//	              void drive() {
//	              System.out.println("Car");
//	                 }
//	               }

     // 3. The concept used here is "Method Overloading".It means defining multiple methods with the same name but different parameter lists.


     // 4. The concept used here is "Method Overriding". It occurs when a child class provides its own implementation of an inherited method with the same name.


     // 5. The concept used here is "Abstraction". One of its feature is An abstract class is declared using the abstract keyword.
           //It can contain both abstract methods and concrete methods.



     // 6.                      Method Overloading 
             // a.Methods have the same name but different parameters.  
             // b.Usually occurs within the same class.  
             // c.Example:
//                        class MethodOverloading {
//                        void add(int a, int b) {
//                        System.out.println(a + b);
//                        }
//
//                        void add(int a, int b, int c) {
//                        System.out.println(a + b + c);
//                        }
//                       }

           //                     Method Overriding 
             // a.A child class provides its own implementation of an inherited method. 
             // b.Occurs between a parent class and a child class. 
             // c.Example:
//                       class Parent {
//                       void display() {
//                       System.out.println("Parent");
//                            }
//                          }
//
//                       class Child extends Parent {
//                       void display() {
//                       System.out.println("Child");
//                            }
//                          }


     // 7.   Abstract Class                                                 
//         a.Declared using the abstract keyword.
//         b.Can contain abstract and concrete methods.
//         c.A class extends an abstract class using extends.

//           Interface
//         a.Declare using interface keyword.
//         b.Can contain abstract methods and, in modern Java, default, static, and private methods.
//         c.A class implements an interface using implements.


     // 8. a. Encapsulation: Combines data and methods into a single class and restricts direct access to data.
//         b. Inheritance: Allows one class to acquire properties and methods from another class.
//         c.Polymorphism: Allows one method name or interface to represent different behaviours.
//         d.Abstraction: Hides implementation details and exposes essential functionality or informations.


     // 9. A private method of a parent class "cannot be" ovverriden by a child class.Because it is accessible only within the class in which it is declared.
//      Example:
//               class Parent {
//               private void display() {
//               System.out.println("Parent method");
//                 }
//               }

//               class Child extends Parent {
//               void display() {
//               System.out.println("Child method");
//                }

//                public static void main(String[] args) {
//                Child c = new Child();
//                c.display();
//                 }
//                }

//      10.
    
    package Tests;

    class BankAccount {
    private int accountNumber;
    private double balance;
    
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


//11.

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class Cash implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Cash Payment: " + amount);
    }
}

// 12.

class Employee {
    int employeeId;
    String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    String department;

    Manager(int employeeId, String name, String department) {
        super(employeeId, name);
        this.department = department;
    }
    
    void displayDetails() {
        System.out.println("Manager Details:");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(int employeeId, String name, String programmingLanguage) {
        super(employeeId, name);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        System.out.println("Developer Details:");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}



// 13.


abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}


public class Oops_Test {

    public static void main(String[] args) {

  
        System.out.println("===== BANK ACCOUNT =====");
        BankAccount account = new BankAccount(86781, 5000);
        account.displayBalance();
        account.deposit(1000);
        account.withdraw(2000);
        account.displayBalance();
        System.out.println();

        System.out.println("===== PAYMENT SYSTEM =====");

        Payment payment;

        payment = new UPI();
        payment.pay(1000);

        payment = new CreditCard();
        payment.pay(2000);

        payment = new Cash();
        payment.pay(500);

        System.out.println();


        
        System.out.println("===== EMPLOYEE MANAGEMENT =====");

        Manager manager = new Manager(28913, "Loga", "HR");
        Developer developer = new Developer(86718, "Valli", "Java");

        manager.displayDetails();

        System.out.println();

        developer.displayDetails();

        System.out.println();

        
        System.out.println("===== SHAPE ABSTRACTION =====");

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}