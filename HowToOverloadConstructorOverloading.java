package method_overloading;

public class HowToOverloadConstructorOverloading 
{
	HowToOverloadConstructorOverloading(int a)
	{
		System.out.println("1");
	}
	HowToOverloadConstructorOverloading(int a, double b)
	{
		System.out.println("2");
	}
	HowToOverloadConstructorOverloading(int a,float f)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		new HowToOverloadConstructorOverloading(20);
		new HowToOverloadConstructorOverloading(22,9.9);
		new HowToOverloadConstructorOverloading(22,9.9f);
		

	}

}
