package scanner_class;

import java.util.Scanner;

public class Circumference_of_circle {
	static Scanner s1=new Scanner(System.in);
	 static double pi_value=Math.PI;
	 static void circle()
	 {
		 //double r=Math.random();
		 System.out.println("enter the value of radius of circle");
		 double r=s1.nextDouble();
		 double circumference_of_circle=2*pi_value*r;
		 System.out.println(circumference_of_circle);
	 }

	public static void main(String[] args) 
	{
	circle();
	}

}
