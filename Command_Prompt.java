package abstractclassprograms;
abstract class Command_Prompt //abstract class
{
	abstract void add();//abstract method
}
public class newclass extends Command_Prompt
{
	void add()
	{
		System.out.println("the real implementation will be here");
	}
	public static void main(String[] args)
	{
		new newclass.add();
	}
	

	}


