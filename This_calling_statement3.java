package calling_statements;

public class This_calling_statement3 {
	This_calling_statement3()
	{
		System.out.println("3");
	}
	This_calling_statement3(int a, int c)
	{
		this();
		System.out.println("2");
	}
	This_calling_statement3(int d)
	{
		this();
		System.out.println("1");
	}

	public static void main(String[] args) {
		new This_calling_statement3(34);

	}

}
