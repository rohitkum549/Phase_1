package mypackage;

public class SelectionSortDemo {

	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
				
			}
			int smallNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallNumber;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,6,3,1,2,4,5};
		int length=a.length;
		System.out.println("The elements before sorting are:");
		for(int i:a) {
			System.out.print(i+"  ");
		}
		selectionSort(a);
		System.out.println("\nThe sorted elements are:");
		for(int i:a) {
			System.out.print(i+"  ");
		}
	}

}
