package basicprogram;
import java.util.Scanner;
public class multiplicationTable {
public static void main(String[]args) {
	int n,m=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	n=sc.nextInt();
    for(int i=1;i<=10;i++) {
    	
    	m=n*i;
    	
    	System.out.println(""+n+"*"+i+"= "+m);
    	
    }



}
}
