package Assignments;
 
import java.util.Scanner;

@FunctionalInterface
interface Student {
    void display();
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
public class functionalinterfaceandlambda {

	public static void main(String[] args) {
		
		  // Question 1: Student using Lambda
        System.out.println("Student Details");

        Student s = () -> {
            System.out.println("Student Name:Loga");
            System.out.println("Age: 21");
            System.out.println("Department: Java");
        };

        s.display();


        // Question 2: Calculator using Lambda
        System.out.println("\nCalculator");

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("Addition: " + add.calculate(20, 30));
        System.out.println("Subtraction: " + sub.calculate(20, 5));
        System.out.println("Multiplication: " + mul.calculate(40, 20));
        System.out.println("Division: " + div.calculate(60, 10));


        // Question 3: String Methods
        System.out.println("\nString Methods");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Length: " + str.length());

        // Reverse
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse: " + rev);

        // Palindrome
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        // Vowels count
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);

        sc.close();
	}

}

