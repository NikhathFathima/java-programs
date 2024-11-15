package scanner_class;

import java.util.Scanner;

public class Scanner_problem {
	
	static Scanner s1=new Scanner(System.in);
	
	static void add()
	{
		System.out.println("enter the value a & b for addition  ");
		int a= s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("The additon of 2 no's is" + sum);
	}
	static void sub()
	{
		System.out.println("enter the value a & b for subtraction  ");
		int a= s1.nextInt();
		int b=s1.nextInt();
		int sub=a-b;
		System.out.println("The subtraction of 2 no's is" + sub);	
	}
	static void mul()
	{
		System.out.println("enter the value a & b for mul  ");
		int a= s1.nextInt();
		int b=s1.nextInt();
		int mul=a*b;
		System.out.println("The mul of 2 no's is" + mul);
	}
	
	static void div()
	{
		System.out.println("enter the value a & b for division ");
		int a= s1.nextInt();
		int b=s1.nextInt();
		int div=a/b;
		System.out.println("The div of 2 no's is" + div);
	}
	static void mod()
	{
		System.out.println("enter the value a & b for modulus  ");
		int a= s1.nextInt();
		int b=s1.nextInt();
		int mod=a%b;
		System.out.println("The mod of 2 no's is" + mod);
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
		
	}

}
