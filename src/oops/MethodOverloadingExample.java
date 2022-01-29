package oops;

public class MethodOverloadingExample {

	
	public void sum(int a , int b) {
		int sum = a+b;
		System.out.println("Sum is " +sum);
	}
	
	public void sum(int a , int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum is " +sum);
	}
}
