package oops;
import java.util.Scanner;
class employee{

int id,ta;
String name;
 float basic,annual;
String designation;

void setdata(int i,String n,float b,String d,float a,int t) {
	
id=i;
name=n;
basic=b;
designation=d;
annual=a;	
ta=t;	
	
displaydata();
}

void displaydata() {

  System.out.println(" EMPLOYEE ID: "+id);
	System.out.println();
	System.out.println(" Employee Name: "+name);
	System.out.println();
	System.out.println(" Employee Basic: "+basic);
	System.out.println();
	System.out.println(" Employee Designation: "+designation);
	System.out.println();
	System.out.println(" Employee Annual salary: "+annual);
	System.out.println();
	System.out.println(" Employee Travel allowance:"+ta);
}
  
}

public class Office {

public static void main(String[]args ) {
	int id=0,ta;
	String name=null;
	float basic=0,annual;
	String designation;

try(Scanner sc=new Scanner(System.in)){

System.out.println("Enter Employee ID:");
id=sc.nextInt();

sc.nextLine();

System.out.println("Enter Employee Name:");
name=sc.nextLine();

System.out.println("Enter Employee Basic salary:");
basic=sc.nextFloat();

sc.nextLine();
System.out.println("Enter Employee Designation:");
designation=sc.nextLine();

annual=basic*12;

switch(designation) {	

case "Manager":  ta=2000;
                   break;
                   
 
case"manager":  ta=2000;               
                   break;
 default: ta=1500;
           
}

System.out.println("========================================================");

employee Anurag=new employee();
Anurag.setdata(id,name,basic,designation,annual,ta);

}
}
}
