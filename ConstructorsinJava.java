package constructors;

public class ConstructorsinJava //class name
{
	protected ConstructorsinJava()
	{
		System.out.println("Constructor In Java should be same as class name");
	}
	/*ConstructorsinJava("para or non-para")
	{
		System.out.println("it can be para or non-parametirised");
	}*/
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		ConstructorsinJava c1=new ConstructorsinJava();
		

	}

}
