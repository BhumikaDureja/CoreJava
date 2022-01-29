package test;

import java.util.Scanner;
public class NumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the Number ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			
			System.out.println("Number is odd");
		}
		
		scanner.close();

	}

}
