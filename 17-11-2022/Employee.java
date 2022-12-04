package Thrusdaylab;

class Person{
	
	String Name;        
  
	public Person(String name){

		this.Name=name;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + "]";
	}
	
}
class Employee extends Person{

double Annualsalary;
int year;
String Insurance;


 Employee(String name,double Annualsalary,int year,String Insurance) {

	super(name);
	this.Annualsalary=Annualsalary;
	this.year=year;
	this.Insurance=Insurance;		
}


@Override
public String toString() {
	return "Employee\n[Annualsalary=" + Annualsalary + "\n year=" + year + "\n Insurance=" + Insurance +"\nName=" + Name
			+ "]";
}


}

public class Testempolyee{

	public static void main(String[] args) {
		
Employee a=new Employee("Anurag", 150000d, 2020, "ACVBRX");
		
System.out.println(a);

System.out.println("============================================");

Employee b=new Employee("Neeta", 10000d, 2013, "AC567BX");

System.out.println(a);

}
}
