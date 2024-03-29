package lab9.exercise4;

import java.util.Scanner;


public class FactorialMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		FactorialUsingLambdaExpression fact = (number)->{
			int product=1;
			for(int i=0;i<=number;i++) {
				if(i==0)
					product=1;
				else
					product=product*i;
			}
			return product;
		};
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		System.out.printf("\nThe factorial of %d is %d.\n",number,fact.factorial(number));
		
		sc.close();
	}

}