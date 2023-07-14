//question:Write A Program To Accept A Number From The User And Check It Is Even Or Odd.

package quest3_3_EvenOrOdd;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num;  //Decalre The Variable
		//Taking  the input from the user 
		Scanner scanner = new Scanner(System.in);  //Create th e input of scanner class
		System.out.println("Enter A Number");
		num = scanner.nextInt();
		if (num%2==0) {  //Checking the condition given number is Even Or Odd
			System.out.println(num + " It's a Even Number");
		}else {
			System.out.println(num + " It's a Odd Number" );
		}
	}
}
