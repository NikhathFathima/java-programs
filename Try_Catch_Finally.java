package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		try
		{
		System.out.print("Enter your Phone Number- ");
		long a = s1.nextLong();
		}
		catch (InputMismatchException a)
		{
			System.out.println("Enter valid Phone Number");
			
			Scanner s2 = new Scanner(System.in);
			try
			{
			System.out.print("Enter your Phone Number- ");
			long a1 = s2.nextLong();
			}
			catch (InputMismatchException a1)
			{
				System.out.println("Enter valid Phone Number");
				
				Scanner s3 = new Scanner(System.in);
				try
				{
				System.out.print("Enter your Phone Number- ");
				long a2 = s3.nextLong();
				}
				catch (InputMismatchException a2)
				{
					System.out.println("Refresh the page and try again");
			}
		}

	}
		finally
		{
			System.out.println("Thank you!");
		}

	}

}
