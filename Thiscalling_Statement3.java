package java_basics_programs;

public class Thiscalling_Statement3 
{
	Thiscalling_Statement3()
	{
		
		System.out.println("addition");
	}
	Thiscalling_Statement3(int a,int b)
	{
		this();
		System.out.println("add1");
	}
	Thiscalling_Statement3(int a,double b)
	{
		this();
		System.out.println("add2");
	}

	public static void main(String[] args) {

		new Thiscalling_Statement3(234,267.98);
		

	}

}
