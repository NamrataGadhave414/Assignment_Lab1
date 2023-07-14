
//Question:Write A Program To Accept Radius From The User And Calculate Area Of Circle And Area Of Circumference.



package Quest2_AreaOfCircleAndCircumcstance;

import java.util.Scanner;

public class Circle {      //Derive class
public static void main(String[] args) {
	double r;   //Radius Of circle Declaration
	double AreaOfCircle;   //Area Of circle Declaration
	double AreaOfCircumference;  //Area Of Circumference
	Scanner scanner =new Scanner(System.in);   
	System.out.println("Enter the Radius Of Circle");
	r=scanner.nextDouble();
	 
	AreaOfCircle=(22*r*r)/7;   //Formula Of Area Of Circle
	System.out.println("The Area Of Circle is: "+AreaOfCircle);
	
	AreaOfCircumference= (2*22*r)/7;   //Formula of Area Of Circumference
	System.out.println("The Area Of Circumference: "+ AreaOfCircumference );
}
}
