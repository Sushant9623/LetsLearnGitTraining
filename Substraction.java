package sub;

import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner maths= new Scanner(System.in);
		
		System.out.println("Enter your first Num");
		int num1=maths.nextInt();
		 
		System.out.println("Enter your second Num");
		int num2=maths.nextInt();
		
		System.out.println("Enter your third Num");
		int num3=maths.nextInt();
		
		int substra=num1-num2-num3;
		 
		System.out.println("The Substraction of the Numbers is = "+substra);
		maths.close();
	}

}
