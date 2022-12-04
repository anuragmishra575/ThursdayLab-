package basicprogram;
import java.util.Scanner;
public class Sumofeven {
public static void main(String[]args) {
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range:");
n=sc.nextInt();
for(int i=2;i<=n;i++) {
	
if(i%2==0) {
	sum=sum+i;
}
}
System.out.println("The sum of even natural number from 1 to "+n+" is: "+sum);
}
}
