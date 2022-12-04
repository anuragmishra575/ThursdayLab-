package Thrusdaylab;

class person{

String name,dateofbirth;
person(String name,String dateofbirth){
	
	this.name=name;
	this.dateofbirth=dateofbirth;
	
}
public String getName() {
	return name;
}
public String getDateofbirth() {
	return dateofbirth;
}

}

class Teacher extends person{

	double salary;
	String subject;
	
	Teacher(String name, String dateofbirth,double salary,String subject) {
		super(name, dateofbirth);
	this.salary=salary;
	this.subject=subject;
		
	}

	public double getSalary() {
		return salary;
	}

	public String getSubject() {
		return subject;
	}


}

class student extends person{

	int studentId;
	student(String name, String dateofbirth,int studentId) {
		super(name, dateofbirth);
		this.studentId=studentId;
	}
	public int getStudentId() {
		return studentId;
	}
	
}



class collegestudent extends student{

	String collegeName;
	String Year;
collegestudent(String name,String dateofbirth,int studentId,String collegeName,String Year){
		
super( name,dateofbirth,studentId);
this.collegeName=collegeName;
this.Year=Year;
	
}
public String getCollegeName() {
	return collegeName;
}
public String getYear() {
	return Year;
}
	
	
}

public class School {

	public static void main(String[] args) {

		
	
	    System.out.println("========================================");
	    Teacher tea=new Teacher("Harvey specter","15-07-1996",50000,"Java Full Stack");
	    System.out.println("Teacher Name: "+tea.getName());
	    System.out.println("Date of Birth: "+tea.getDateofbirth());
	    System.out.println("Salary: "+tea.getSalary());
	    System.out.println("She Teaches us Subject: "+tea.getSubject());
	    
	    System.out.println("=========================================");
	    student stud=new student("Anurag","20-04-1999",101);  
	    System.out.println("Student Name: "+stud.getName());
	    System.out.println("Date of Birth: "+stud.getDateofbirth());
	    System.out.println("Student Id: "+stud.getStudentId());
	    
	    System.out.println("=========================================");
	    collegestudent colstud=new collegestudent("Anurag","20-04-1999",101,"Anudip Foundation","First");
	    System.out.println("Student Name: "+colstud.getName());
	    System.out.println("Date of Birth: "+colstud.getDateofbirth());
	    System.out.println("Student Id: "+colstud.getStudentId());
	    System.out.println("College Name: "+colstud.getCollegeName());
	    System.out.println("Year of Studying: "+colstud.getYear());
		
}
}
