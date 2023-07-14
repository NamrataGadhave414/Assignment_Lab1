  
//Quest3.1 Write a age and check the user are eligible for voting or Not 
package quest3_1_Voting_Eligibility;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		int age; //Declare the variable
		//Take the input fromm the user Create the input of scanner class
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your Age:");  
		age=scanner.nextInt();
		if (age >= 18) {  //Checking condition for voting
			System.out.println("You Are  Eligible For Voting");
		} else {
			 System.out.println("You Are Not Eligible For Voting");
		}
		
	}
}
