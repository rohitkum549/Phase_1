package mypackage;

import java.util.*;
public class LinearSearch {

	public static int linearing(int arr[],int x) {
		int arrLength=arr.length;
		for(int i=0;i<=arrLength-1;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched:");
		int searchValue=sc.nextInt();
		
		int result=linearing(a, searchValue);
		if(result==-1) {
			System.out.println("Element not found in the array");
		}
		else {
			System.out.println("element found at "+result+
					" index and the search key is "+a[result]);
		}
	}

}
