package Thrusdaylab;
import java.util.Scanner;
public class maxminarray {

	public static void findMaxAndMin(int arr[],int size) {
		int n=arr.length;                       
		int max=Integer.MIN_VALUE; 
     	int min=Integer.MAX_VALUE;
	for(int i=0;i<size;i++) {
	 max=Math.max(arr[i],max);       
	 min=Math.min(arr[i],min);
}	
	System.out.println("Maximum number of the array is: "+max);
    System.out.println("Minimum number of the array is: "+min);
	return;
	}
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++) {
			
			arr[i]=sc.nextInt();}

		findMaxAndMin(arr,size);	
}
}
