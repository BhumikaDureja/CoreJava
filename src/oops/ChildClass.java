package oops;


public class ChildClass extends Person{

	String Profession;
	
	public ChildClass() {
		System.out.println("Inside Child Default Constructor");
	}
	
	public ChildClass(String Name, int Age, String Profession) {
		
		super(Name,Age);
		this.Profession = Profession;
		
	}
	
	public void display() {
		
	//	super.display(); //-- It will call display of parent class
		System.out.println("Inside Child");
	}
	
	public void print() {
		
		System.out.println("Inside Child");
	}
}

