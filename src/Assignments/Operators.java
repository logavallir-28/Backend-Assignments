package Assignments;

public class Operators {

public static void main(String[] args) {
		
		
		//Arithmetic operator
		System.out.println("");
        System.out.println("---Arithmetic operator---");
		int a=30;
        int b=20;
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+a*b);
        System.out.println("Division:"+a/b);
        System.out.println("Modules:"+a%b);
        
        //Relational Operator
        System.out.println("");
        System.out.println("---Relational Operator---");
        int c=10;
        int d=30;
        System.out.println("Equal:"+(c==d));
        System.out.println("Greater then:"+(c>d));
        System.out.println("Lesser then:"+(c<d));
        
        
        //Assignment Operator
        System.out.println("");
        System.out.println("---Assignment Operator---");
        int number=80;
        number+=20;
        System.out.println("Add and assign:"+number);
        number-=20;
        System.out.println("Subtract and assign:"+number);
        number-=20;
        System.out.println("Multiply and assign:"+number);
        number-=20;
        System.out.println("Divide and assign:"+number);
        
        //Students marks calculation
        System.out.println("");
        System.out.println("---Student Marks---");
        int marks=85;
        int totalMarks = 100;
        System.out.println("Marks Scored:"+marks);
        double percentage = ((double) marks / totalMarks) * 100;
        System.out.println("Total Percentage:"+percentage);
        
        
      //Product Price Calculation
        System.out.println("");
        System.out.println("---Product Price Calculation---");
        double price = 999.50;
        int quantity = 3;
        double discount = 10;
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;
        totalPrice -= discountAmount;
        System.out.println("Final Price: " + totalPrice);


	}

}
