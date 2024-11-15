package calling_statements;
class setUrl
{
	setUrl()
	{
		System.out.println("seturl");
	}
}
class Launch_the_browser extends setUrl
{
	Launch_the_browser()
	{
		super();//it is present in each constructor in first line
		System.out.println("Launch_the_browser");
		
	}
}

public class Supercalling_statement extends Launch_the_browser
{
	Supercalling_statement()
	{
		
		System.out.println("Supercalling_statement");
	}

	public static void main(String[] args) {
		
		Supercalling_statement s1=new Supercalling_statement();
		
	}

}
