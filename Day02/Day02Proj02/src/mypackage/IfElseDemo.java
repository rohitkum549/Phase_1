package mypackage;

import java.util.*;
public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(a+" is less than "+b);
		}
		
	}

}
