package scanner_class;

import java.util.Scanner;

public class Area_of_rectangle {
	static Scanner s1=new Scanner(System.in);
	
	static void rectangle()
	{
		System.out.println("enter the value of length");
		double l=s1.nextDouble();
		System.out.println("enter the value of length");
		double b=s1.nextDouble();
		double area=l*b;
		System.out.println("Area of rectangle is=" +area);
	}

	public static void main(String[] args) 
	{

      rectangle();
	}

}
