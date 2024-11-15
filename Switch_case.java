package switchcaseinjava;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENter Name");
		String name = s1.next();
		switch(name)
		{
		case "Nikhath":
			System.out.println("Nikhath Typed");
			break;
		case "Raani":
			System.out.println("Raani Typed");
			break;
		case "Nita":
			System.out.println("Nita Typed");
			break;
		default:
			System.out.println("Enter Correct Name");
	
}
	}
}
