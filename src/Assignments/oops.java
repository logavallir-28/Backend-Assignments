
package Assignments;

public class oops {

    // 1. Class and Object
    static class Student {
        String name;
        int rollNo;
        int mark;

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Mark: " + mark);
            System.out.println();
        }
    }

    // 2. Inheritance
    static class Employee {
        String name;
        int id;
        double salary;

        void displayEmployee() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
        }
    }

    static class Developer extends Employee {
        String programmingLanguage;

        void displayDeveloper() {
            displayEmployee();
            System.out.println("Programming Language: " + programmingLanguage);
        }
    }

    // 3. Encapsulation
    static class BankAccount {
        private long accountNumber;
        private double balance;

        BankAccount(long accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public long getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Invalid amount or insufficient balance");
            }
        }
    }

    // 4. Polymorphism
    static class Payment {
        void pay() {
            System.out.println("Processing payment");
        }
    }

    static class UPIPayment extends Payment {
        @Override
        void pay() {
            System.out.println("Payment made using UPI");
        }
    }

    static class CardPayment extends Payment {
        @Override
        void pay() {
            System.out.println("Payment made using Card");
        }
    }

    static class CashPayment extends Payment {
        @Override
        void pay() {
            System.out.println("Payment made using Cash");
        }
    }

    // Main method
    public static void main(String[] args) {

        // 1. Class and Object
        System.out.println("=== Student Details ===");

        Student s1 = new Student();
        s1.name = "Loga";
        s1.rollNo = 101;
        s1.mark = 90;
        s1.display();

        Student s2 = new Student();
        s2.name = "Priya";
        s2.rollNo = 102;
        s2.mark = 85;
        s2.display();

        // 2. Inheritance
        System.out.println("=== Developer Details ===");

        Developer d = new Developer();
        d.name = "Loga";
        d.id = 201;
        d.salary = 30000;
        d.programmingLanguage = "Java";
        d.displayDeveloper();

        System.out.println();

        // 3. Encapsulation
        System.out.println("=== Bank Account ===");

        BankAccount b = new BankAccount(123456789, 5000);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Initial Balance: " + b.getBalance());

        b.deposit(2000);
        b.withdraw(1000);

        System.out.println("Final Balance: " + b.getBalance());

        System.out.println();

        // 4. Polymorphism
        System.out.println("=== Payment System ===");

        Payment p;

        p = new UPIPayment();
        p.pay();

        p = new CardPayment();
        p.pay();

        p = new CashPayment();
        p.pay();
    }
}
