package quest3_2_greatestnumber;

import java.util.Scanner;

public class GreatestNumber {  //Derived class
	public static void main(String[] args) {  //Main method
		int number1, number2, number3;   //Declare the variable
		
		Scanner scanner= new Scanner(System.in);  
		//Take the input from the user Create the input of scanner class
		System.out.println("Enter First Number");
		System.out.println("Enter Second Number");
		System.out.println("Enter Third Number");
		
		number1=scanner.nextInt();
		number2=scanner.nextInt();
		number3=scanner.nextInt();
		if (number1> number2 && number1 > number3 ) {
			System.out.println(number1 +  " It's a Greater Number");
		} else if(number2 > number3 ){
			System.out.println(number2 + " It's a Greater Number");
		}else {
			System.out.println(number3 + " It's a Greater Number");
		}
		
	}
}
