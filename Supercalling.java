package supercalling;

public class Supercalling {
	public Supercalling()
	{
	System.out.println("1");
	}
	public Supercalling(int a, double b)
	{
		super();
		System.out.println("2");
	}

	public static void main(String[] args) {
		
Supercalling s1= new Supercalling(23, 23.33);

	}

}
