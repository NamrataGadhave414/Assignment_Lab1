package quest3_3_EvenOrOdd;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number");
		num = scanner.nextInt();
		if (num%2==0) {
			System.out.println(num + " It's a Even Number");
		}else {
			System.out.println(num + " It's a Odd Number" );
		}
	}
}
