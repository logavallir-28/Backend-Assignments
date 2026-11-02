package Assignments;
import java.util.Scanner;

public class loopsandconditions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// 1.Positive Number
		
		System.out.println("");
		System.out.println("====Positive Number====");
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if(a>=0) {
			System.out.println("It is a Postive Number");
		}
		
		
		// 2.Even Or Odd
		
		
		System.out.println("");
		System.out.println("====Even Or Odd====");
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		
		
		if(b%2==0) {
			System.out.println("Even Number");
		}else
			System.out.println("Odd Number");
		
		
	
	    // 3.Vowel or Constant
		
		System.out.println("");
		System.out.println("====Vowels or Constant====");
		System.out.println("Enter a character:");
		char word=sc.next().charAt(0);
		
		if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
			 System.out.println("The character is Vowel");
	    } else {
	        System.out.println("The  character is Consonant");
	    }
		
		
		// 4.Leap year
		
		 System.out.println("");
	     System.out.println("====Leap Year====");
	     System.out.println("Enter a year:");
		
			int year = sc.nextInt();

	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    System.out.println("It is a leap year");
	                } else {
	                    System.out.println("It is not a leap year");
	                }
	            } else {
	                System.out.println("It is a leap year");
	            }
	        } else {
	            System.out.println("It is not a leap year");
	        }
	        
	        
	        
	     // 5.Largest of two numbers
	        
	        System.out.println("");
		    System.out.println("====Largest  of two numbers====");
		    System.out.print("Enter first number: ");
		    int d = sc.nextInt();

		    System.out.print("Enter second number: ");
		    int e = sc.nextInt();

		    if (d > e) {
		    System.out.println(d + " is the largest number");
		    } else if (e > d) {
		    System.out.println(e + " is the largest number");
		    } else {
		    System.out.println("Both numbers are equal");
		        }
	        
		}
		
	}


