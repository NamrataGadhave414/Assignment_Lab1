
//Write A Program Using Switch Case which will display the option of all operators.

package quest1_Switchcases_displayalloperation;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char operator;
		double Num1, Num2, result;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Num1 ");
		Num1 = scanner.nextInt();

		System.out.println("Enter a Operator");
		operator = scanner.next().charAt(0);
		System.out.println("Enter Num2");
		Num2 = scanner.nextDouble();
		switch (operator) {

		// performs additions between numbers
		case '+':
			result = Num1 + Num2;
			System.out.println(Num1 + "+" + Num2 + "= " + result);
			break;

		// performs subtractions between numbers
		case '-':
			result = Num1 - Num2;
			System.out.println(Num1 + "-" + Num2 + "=" + result);
			break;

		// performs multiplications between numbers
		case '*':
			result = Num1 * Num2;
			System.out.println(Num1 + "*" + Num2 + " = " + result);
			break;

		// performs division between numbers
		case '/':
			result = Num1 / Num2;
			System.out.println(Num1 + "/" + Num2 + "= " + result);

		default:
			System.out.println("Invalid operator !");
			break;
		}

	}
}
