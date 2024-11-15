package java_basics_programs;

public class Globle_Variable_prgm 
{
static double pi=3.14;

static void area()
{
	int r=2;
	double area=pi*r*r;
	System.out.println(area);
}

	public static void main(String[] args)
	{
		int r=10;
		double area=pi*r*r;
		System.out.println(area);
		area();

	}

}
