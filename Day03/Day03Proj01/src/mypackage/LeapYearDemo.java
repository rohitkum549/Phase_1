package mypackage;
import java.util.*;
public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a year(e.g., 2020):");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}

}
