package Assignments;

import java.util.Scanner;

public class Dimensionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



        Scanner sc = new Scanner(System.in);

        // QUESTION 1 - 1D ARRAY

        System.out.println("===== 1D ARRAY =====");

        int marks[] = new int[10];

        int highest = 0;
        int lowest = 100;
        int total = 0;
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter mark of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 35) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("\n All Student Marks:");

        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
        }

        double average = total / 10.0;

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);


        // QUESTION 2 - 2D ARRAY

        System.out.println("\n===== 2D ARRAY =====");

        int marks2[][] = new int[3][4];

        int overallHighest = 0;
        int topperClass = 0;
        int topperStudent = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("\nEnter marks for Class " + (i + 1));

            for (int j = 0; j < 4; j++) {

                System.out.print("Enter mark of student " + (j + 1) + ": ");
                marks2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            int classTotal = 0;
            int classHighest = marks2[i][0];

            System.out.println("\nClass " + (i + 1) + " Marks:");

            for (int j = 0; j < 4; j++) {

                System.out.println("Student " + (j + 1) + ": " + marks2[i][j]);

                classTotal = classTotal + marks2[i][j];

                if (marks2[i][j] > classHighest) {
                    classHighest = marks2[i][j];
                }

                if (marks2[i][j] > overallHighest) {
                    overallHighest = marks2[i][j];
                    topperClass = i + 1;
                    topperStudent = j + 1;
                }
            }

            System.out.println("Class Total: " + classTotal);
            System.out.println("Class Highest: " + classHighest);
        }

        System.out.println("\nOverall Highest Mark: " + overallHighest);
        System.out.println("Topper Class: " + topperClass);
        System.out.println("Topper Student: " + topperStudent);


        // QUESTION 3 - 3D ARRAY

        System.out.println("\n===== 3D ARRAY =====");

        int marks3[][][] = new int[2][2][3];

        int overallTopper = 0;

        for (int i = 0; i < 2; i++) {

            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < 2; j++) {

                System.out.println("Class " + (j + 1));

                for (int k = 0; k < 3; k++) {

                    System.out.print("Enter mark of student " + (k + 1) + ": ");
                    marks3[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < 2; i++) {

            int departmentHighest = 0;

            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < 2; j++) {

                int classTotal = 0;

                System.out.println("\nClass " + (j + 1) + " Marks:");

                for (int k = 0; k < 3; k++) {

                    System.out.println("Student " + (k + 1) + ": " + marks3[i][j][k]);

                    classTotal = classTotal + marks3[i][j][k];

                    if (marks3[i][j][k] > departmentHighest) {
                        departmentHighest = marks3[i][j][k];
                    }

                    if (marks3[i][j][k] > overallTopper) {
                        overallTopper = marks3[i][j][k];
                    }
                }

                double classAverage = classTotal / 3.0;

                System.out.println("Class Total: " + classTotal);
                System.out.println("Class Average: " + classAverage);
            }

            System.out.println("\nDepartment Highest Mark: " + departmentHighest);
        }

        System.out.println("\nOverall Highest Mark: " + overallTopper);

        sc.close();
    

	}

}
