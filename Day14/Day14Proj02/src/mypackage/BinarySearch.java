package mypackage;

public class BinarySearch {

	public static void binSearch(int[] arr,int start,int key,int length) {
		boolean flag=false;
		int midValue=(start+length)/2;
		while(start<length) {
			if(arr[midValue]<key) {
				start=midValue+1;
			}
			else if(arr[midValue]==key) {
				flag=true;
				break;
			}
			else {
				length=midValue-1;
			}
			midValue=(start+length)/2;
		}
		if(flag==false) {
			System.out.println("Element is not found");
		}
		else {
			System.out.println("Element is found at index:"+midValue);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,6,9,12,15};
		int key=17;
		int arrLength=a.length;
		
		binSearch(a,0,key,arrLength);
	}

}
