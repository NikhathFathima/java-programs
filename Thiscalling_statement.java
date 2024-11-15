package calling_statements;

public class Thiscalling_statement 
{
	Thiscalling_statement(int a)
	{
		System.out.println("1");
	}
	Thiscalling_statement(int a,int b)
	{
		this(12);
		System.out.println("2");
	}
	Thiscalling_statement(double a)
	{
		this(20,20);
		System.out.println("3");
	}

	
	public static void main(String[] args) {
		
		Thiscalling_statement t1=new Thiscalling_statement(2.3);
		
	}

}
