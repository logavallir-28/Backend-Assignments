package Assignments;

public class Synchronise {


    // 1. THREAD LIFE CYCLE

    public static class Order extends Thread {

        public void run() {

            System.out.println("\n1. THREAD LIFE CYCLE");
            System.out.println("Order processing started");
            System.out.println("State: " + Thread.currentThread().getState());

            try {
                System.out.println("Order is processing...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                System.out.println(e);
            }

            System.out.println("Order completed");
        }
    }


    // 2. SYNCHRONIZATION - BANK ACCOUNT

    public static class Bank {

        int balance = 5000;

        synchronized void withdraw(int amount) {

            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
                balance = balance - amount;
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance for "
                        + Thread.currentThread().getName());
            }
        }
    }


    // 3. WAIT AND NOTIFY - FOOD ORDER

    public static class Food {

        boolean ready = false;

        synchronized void customer() {
            try {
                while (!ready) {
                    System.out.println("\nCustomer is waiting for food");
                    wait();
                }
                System.out.println("Customer collected the food");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        synchronized void chef() {
        	
            System.out.println("Chef is preparing food");
            ready = true;
            System.out.println("Food is ready");
            notify();
        }
    }


    // 4. NOTIFYALL - MULTIPLE STUDENTS

    public static class Result {

        boolean published = false;

        synchronized void student(String name) {

            try {
                while (!published) {
                    System.out.println(name + " is waiting for results");
                    wait();
                }
                System.out.println(name + " received the result");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        synchronized void teacher() {
            System.out.println("Teacher is publishing the results");
            published = true;
            notifyAll();
        }
    }


    // 5. PRODUCER AND CONSUMERS

    public static class Company {

        int product = 0;
        synchronized void produceOne() {
            product++;
            System.out.println("\nProducer produced one product");
            notify();
        }

        synchronized void produceTwo() {
          product = product + 2;
          System.out.println("Producer produced two products");
            notifyAll();
        }

        synchronized void consume(String name) {
            try {
                while (product == 0) {
                    System.out.println(name + " is waiting for product");
                    wait();
                }
                System.out.println(name + " consumed one product");
                product--;
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    

	 }
}
