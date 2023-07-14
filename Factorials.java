
//Question: Write A Program To Accept A No From The User And Find Out Factorial
package quest4_Factorials;

import java.util.Scanner;

public class Factorials {  
	public static void main(String[] args) {
		int number;// declare the variable
		int fact=1; //
		//Take the input fromm the user Create the input of scanner class
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter A Number");   
		number=scanner.nextInt();    //Initialize the variable
		while(number >=1) {
		fact =fact * number;
		number--;
		}
		System.out.println("The Factorial is :" + fact);
	}
}
