package method_overloading;

public class Method_Overloading 
{
	static void add(int c)//1 parameter
	{
		int sum=c+2;
		System.out.println(sum);
	}
	static void add(int a,double b)
	{
		double sum=a+b+6;
		System.out.println(sum);
	}
	static void add(int a,int b)
	{
		
	}
	static void add(double a)
	{
		
	}
	

	public static void main(String[] args)
	{
		add(100);
		add(8,8.9);
		
	}

}
