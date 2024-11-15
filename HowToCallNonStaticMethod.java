package java_basics_programs;

public class HowToCallNonStaticMethod //by creating object in a main method 
{
	void add()
	{
		int no1=10;
		int no2=20;
		int sum=no1+no2;
		System.out.println(sum);
	}
	void sub()
	{
		int no1=10;
		int no2=20;
		int sub=no2-no1;
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		HowToCallNonStaticMethod h1= new HowToCallNonStaticMethod();
		h1.add();
		h1.sub();

	}

}
