package mypackage;

import java.util.*;
public class ExceptionDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a value:");
			int a=sc.nextInt();
			System.out.println("Enter b value:");
			int b=sc.nextInt();
			int res=a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.err.println("Divide by zero not allowed");
		}
		catch(Exception e) {
			System.err.println("Please enter a integer value");
		}
		finally {
			System.out.println("Hey, I am finally block");
		}
	}

}
