package basicprogram;
import java.util.Scanner;
public class Firstlast {
public static void main(String[]args) {
	int n,last,first,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	n=sc.nextInt();
	temp=n;
	while(n>=10) {
		
		  n /= 10;
	  	
	}
	first=n;
	
last=temp%10;
System.out.println("First digit is "+first);
System.out.println("Last digit is "+last);
}
}
