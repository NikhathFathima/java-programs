package inheritance;

class Parent
{
	static void add()
	{
		int a=2;
		int b=2;
		int sum=a+b;
		System.out.println(sum);
	}
	
}

public class Singlelevel_inheritance extends Parent
{
	static void sub()
	{
		int a=2;
		int b=2;
		int sub=a-b;
		System.out.println(sub);
	}
	
	
	
	public static void main(String[] args) 
	{
		add();
		sub();
	}


}
