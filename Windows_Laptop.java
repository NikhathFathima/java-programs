package abstractprograms;
abstract class command_prompt//abstract class
{
	abstract void add();//Abstract methods
}

public class Windows_Laptop extends command_prompt//concrete class
{
	void add()
	{
		
		System.out.println("The real implementation is here");
	}


	public static void main(String[] args)//concrete method
	{
		new Windows_Laptop().add();
	}

}
	

