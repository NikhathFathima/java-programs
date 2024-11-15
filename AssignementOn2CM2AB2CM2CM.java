package abstractprograms;
class one
{
	public void add()
	{
		System.out.println("add");
	}
	public void sub() 
	{
		System.out.println("sub");
	}
	
}

abstract class Newclassthree extends one
{
	abstract void add1();
	abstract void sub1();
	
	static void mod()
	{
		System.out.println("mod1");
	}
	static void sub2()
	{
		System.out.println("sub2");
	}
	
	
}
public class AssignementOn2CM2AB2CM2CM extends Newclassthree
{
   static void mul()
   {
	   System.out.println("concrete method");
   }
   static void div()
   {
	   System.out.println("concrete method2");
   }
   void add1()
   {
		System.out.println("adding implementation on abstract method1");
		
	}
	
	void sub1() 
	{
		System.out.println("adding implementation on abstract method2");
		
		
	}



	public static void main(String[] args) 
	{
		mul();
		div();
		new AssignementOn2CM2AB2CM2CM().add();
		new AssignementOn2CM2AB2CM2CM().add1();
		new AssignementOn2CM2AB2CM2CM().sub();
		new AssignementOn2CM2AB2CM2CM().sub1();
        mod();
        sub2();
	    
	}
	
	

}
