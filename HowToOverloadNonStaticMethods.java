package method_overloading;

public class HowToOverloadNonStaticMethods 
{
      void add(int c)//1 parameter
	{
		int sum=c+2;
		System.out.println(sum);
	}
      void add(int a,double b)
	{
		double sum=a+b+6;
		System.out.println(sum);
	}
	 void add(int a,int b)
	{
		
	}
	 void add(double a)
	{
		System.out.println("Hasnain");
	}

	public static void main(String[] args) 
	{
		HowToOverloadNonStaticMethods h1=new HowToOverloadNonStaticMethods();
		h1.add(3.14);
		h1.add(22, 33.20);
	}

}
