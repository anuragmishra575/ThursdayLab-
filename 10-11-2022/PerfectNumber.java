package oops;
import java.util.Scanner;
public class PerfectNumber {
	
	static boolean perfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
		
			if(n%i==0) {
			
				sum=sum+i;
	
      }
			}
	
	if(sum==n && n!=1) {
	
	return true;
		}
	else {return false;}
			
	}
		
	public static void main(String[]args) {
    try(Scanner sc=new Scanner(System.in)){ 
 int n1,n2;
	
	System.out.println("ENTER RANGE: ");
	n1=sc.nextInt();
	System.out.println("TO");
	n2=sc.nextInt();
	for(int i=n1;i<=n2;i++) {
		
		
  	if(perfect(i)) {
		
		System.out.println(i);
			
	}
			
	}
	
}
}
}
