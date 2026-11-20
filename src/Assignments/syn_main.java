package Assignments;

public class syn_main {

	
		 public static void main(String[] args) throws InterruptedException {


		        // 1. THREAD LIFE CYCLE

		        System.out.println("-----1. THREAD LIFE CYCLE-----");

		        Synchronise.Order t1 = new Synchronise.Order();

		        System.out.println("State: " + t1.getState());
		        t1.start();
		        Thread.sleep(300);
		        System.out.println("State: " + t1.getState());
		        t1.join();

		        System.out.println("State: " + t1.getState());


		        // 2. SYNCHRONIZATION - BANK ACCOUNT

		        System.out.println("\n-----2. BANK ACCOUNT-----");

		        Synchronise.Bank b = new Synchronise.Bank();

		        Thread t2 = new Thread(() -> b.withdraw(4000), "Thread 1");
		        Thread t3 = new Thread(() -> b.withdraw(4000), "Thread 2");
		        t2.start();
		        t3.start();
		        t2.join();
		        t3.join();

		        System.out.println("Final Balance: " + b.balance);


		        // 3. WAIT AND NOTIFY - FOOD ORDER

		        System.out.println("\n-----3. FOOD ORDER-----");

		        Synchronise.Food f = new Synchronise.Food();

		        Thread customer = new Thread(() -> f.customer());
		        Thread chef = new Thread(() -> f.chef());
		        customer.start();
		        Thread.sleep(500);

		        chef.start();
		        customer.join();
		        chef.join();


		        // 4. NOTIFYALL - MULTIPLE STUDENTS

		        System.out.println("\n-----4. STUDENT RESULTS-----");

		        Synchronise.Result r = new Synchronise.Result();

		        Thread s1 = new Thread(() -> r.student("Student 1"));
		        Thread s2 = new Thread(() -> r.student("Student 2"));
		        Thread s3 = new Thread(() -> r.student("Student 3"));
		        s1.start();
		        s2.start();
		        s3.start();
		        Thread.sleep(500);

		        Thread teacher = new Thread(() -> r.teacher());

		        teacher.start();
		        s1.join();
		        s2.join();
		        s3.join();
		        teacher.join();


		        // 5. PRODUCER AND CONSUMERS

		        System.out.println("\n------5. PRODUCER AND CONSUMERS-------");

		        Synchronise.Company c = new Synchronise.Company();

		        Thread c1 = new Thread(() -> c.consume("Consumer 1"));
		        Thread c2 = new Thread(() -> c.consume("Consumer 2"));
		        Thread c3 = new Thread(() -> c.consume("Consumer 3"));

		        Thread producer = new Thread(() -> {

		            try {
		                Thread.sleep(1000);
		                c.produceOne();
		                Thread.sleep(1000);
		                c.produceTwo();
		            } catch (InterruptedException e) {

		                System.out.println(e);
		            }
		        });

		        c1.start();
		        c2.start();
		        c3.start();
		        Thread.sleep(500);
		        producer.start();
		        c1.join();
		        c2.join();
		        c3.join();
		        producer.join();

		        System.out.println("All consumers completed");

		   
	}

}
