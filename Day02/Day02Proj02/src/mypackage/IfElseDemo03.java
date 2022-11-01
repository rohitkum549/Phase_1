package mypackage;

import java.util.*;
public class IfElseDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accept age and weight from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter Weight:");
		int weight=sc.nextInt();
		
		//apply condition on age and weight
		if(age>=18) {
			if(weight>50) {
				System.out.println("You are eligible to donate blood");
			}
		}
	}

}
