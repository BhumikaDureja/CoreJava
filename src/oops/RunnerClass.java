package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 242423;
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Mahesh";
		emp2.EmployeeId = 543456;
		emp2.Salary = 1200; */
		
		//Employee emp1 = new Employee("Sachin",242423,1000);
		//Employee emp2 = new Employee("Mahesh",543456,1200);
		
		//emp1.PrintName();
		//emp2.PrintName();

		Employee emp3 = new Employee("Rahul",456785);
		
		Employee.ChangeCompanyName();
		
		Person per1 =new Person(); // this will call only Parent class default constructor
		
		ChildClass child = new ChildClass(); // This will call first Parent class default constructor and then Child Class default constructor
		ChildClass child1 =new ChildClass("Rahul",30,"Actor"); //here Rahul is name of the Parent and 30 is age of Parent and Actor is Profession of ChildClass
		
       child1.display();
	   child1.print();
		
	   
	   MethodOverloadingExample obj = new MethodOverloadingExample();
	   obj.sum(4, 6);
	   obj.sum(4, 6, 7);
	   
	//   BankExample bank = new BankExample(); -- cannot create object of abstract class
	   
	   ICICIBank bank1 = new ICICIBank();
	   bank1.CreditCard();
	   bank1.Welcome();
	   
	   EncapsulationExample obj10 = new EncapsulationExample();
	   obj10.setFirstName("Rohit");
	   System.out.println(obj10.getFirstName());
	   
	}


}
