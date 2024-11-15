package java_basics_programs;

public class Final_variable {
	final double pi=3.14;
	final static int no_of_days_in_leap_year=366;

	public static void main(String[] args) 
	{
		System.out.println(no_of_days_in_leap_year);//static global variable
		
		Final_variable f1=new Final_variable();//non static global variable
		double pi2 = f1.pi;
		System.out.println(pi2);
	}

	
	}


