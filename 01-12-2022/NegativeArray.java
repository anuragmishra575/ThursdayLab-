package Thrusdaylab;

import java.util.Scanner;

public class negativearray {

	public static void main(String[] args) {
		int arr[],size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++) {
			
			arr[i]=sc.nextInt();
			
			             }
System.out.println("Array :");
		for(int i=0;i<size;i++)
	{
			if(arr[i]<0) {
			System.out.print(arr[i]+" ");
			}
	}		
	}

}

  
