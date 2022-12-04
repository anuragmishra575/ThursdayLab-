package oops;
import java.util.Scanner;

class bank{

float amount,withdraw,deposit;


void deposit() {
	System.out.println();
	System.out.println("TRANSACTION SUCCESSFUL ");
	System.out.println("CURRENT BALANCE: "+(amount+deposit));
	DW.main(null);
}


void withdraw() {
	
if(withdraw<=amount) {
	System.out.println();
	System.out.println("TRANSACTION SUCCESSFUL ");
	System.out.println("CURRENT BALANCE: "+(amount-withdraw));
}	
else{
	System.out.println();	
	System.out.println("TRANSACTION UNSUCCESSFUL ");
	System.out.println("CURRENT BALANCE: "+amount);
	}

	 DW.main(null);
}

	
}

public class DW {
public static void main(String[]args) {
	int i;
float amount,withdraw,deposit;
try(Scanner sc=new Scanner(System.in)){

	System.out.println();

System.out.println("Enter the Bank balance: ");	
amount=sc.nextFloat();

System.out.println();

bank a=new bank();

a.amount=amount;
System.out.println(" Enter 1 for Withdrawal:");
System.out.println(" Enter 2 for Deposit:");

i=sc.nextInt();

if(i==1) {
System.out.println("Enter the amount to be withdrawn: ");
withdraw=sc.nextFloat();
a.withdraw=withdraw;
a.withdraw();
}
else {

System.out.println("Enter the amount to be Deposited: ");
deposit=sc.nextFloat();
a.deposit=deposit;	
a.deposit();
}
}
}
}
