
package Jdbc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	college_db coldb = new college_db();
    	coldb.createtable();

    	company_db emp = new company_db();
    	emp.createtable();
    	emp.insertemployee(sc);

    	shopping_db call = new shopping_db();
    	call.createtable();
    	call.insertproduct(sc);

    	sc.close();
}
}
