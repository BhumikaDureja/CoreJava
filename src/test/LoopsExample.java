package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =1 ;
		while(num1<=10) {
			
			//to skip number 5		
			if(num1==5) {
				num1=num1+1;
				continue;
			}
			System.out.println(num1);
			num1=num1+1;
		}
		
		
		// For Loop
		for(int count=1; count<=10;count++) {
			
			if(count==5) {
				break;
			}
			System.out.println("Inside For LOOP " +count);
		}
		
		for (int count=10;count>=1;count--)
        {
            System.out.println("The count the value= "+count);
        }
		
		//Arrays with Loop
		
		int[] array1 = {20,30,40,60};
		
		for(int index=0;index<array1.length;index++) {
			System.out.println("value inside array " +array1[index]);
		}
		
	//	for each loop. prints value of each value in the array
		for(int value:array1) {
			System.out.println(value);
		}
	}

}
