package quest5_table;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int number;  //Declare the variable
		//Take the input fromm the user Create the input of scanner class
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Number:");
		number=scanner.nextInt();
		for(int i=1; i<=10;i++) {
			System.out.println( number + "*" + i + "=" + number * i );
		}

	}
}
