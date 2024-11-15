package sib_iib;

public class SIB_IIB_MM_CON {
	static
	{
		System.out.println("SIB");//SIB WILL EXECUTE 1ST AND MAIN METHOD
	}
	SIB_IIB_MM_CON()
	{
		System.out.println("CONSTRUCTOR1");//Once creating object IIB will execute 1st then constructor will execute
		
	}
	SIB_IIB_MM_CON(int a)
	{
		System.out.println("CONSTRUCTOR2");//Once creating object IIB will execute 1st then constructor will execute
		
	}
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB1");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		new SIB_IIB_MM_CON();
		new SIB_IIB_MM_CON(100);
	}

}
