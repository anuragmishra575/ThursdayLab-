package Thrusdaylab;

import java.util.Scanner;

public class arrayodev {
public static void main(String[]args) {
	int arr[],size,odd=0,even=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	size=sc.nextInt();
	arr=new int[size];
	System.out.println("Enter array elements:");
	for(int i=0;i<size;i++) {
		
		arr[i]=sc.nextInt();
		
		             }
	for(int i=0;i<size;i++) {
		
		if(arr[i]/2==0) {
	 
			even++;
		             }	
		else {
			
			odd++;
		}
	}

	System.out.println("Number of even element are "+even);
	System.out.println("Number of odd element are "+odd);
}
}
