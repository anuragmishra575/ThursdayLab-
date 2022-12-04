package Thrusdaylab;

class Animal{

	void eat() {
		
		System.out.println("Eat method");
	}
	void sleep() {

		System.out.println("Sleep method");
	}
}
class bird extends Animal{
	
void fly(){
	
	super.eat();
	super.sleep();
	System.out.println("Fly method");
}
}	


public class Animals {

	public static void main(String[] args) {

		Animal A=new Animal();
		A.eat();
		A.sleep();
		System.out.println("================================================");
		bird b=new bird();
		b.fly();
	}
