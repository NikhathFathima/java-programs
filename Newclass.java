package abstractprograms;
abstract class Newclasstwo
{
	abstract void add();
	abstract void sub();
	
}

abstract class Newclassone extends Newclasstwo
{
	abstract void add1();
	abstract void sub1();
	
	
}
public class Newclass extends Newclassone
{
   static void mul()
   {
	   System.out.println("concrete method");
   }
   void div()
   {
	   System.out.println("concrete method2");
   }
   void add1() 
   {
	   System.out.println("abstract method1");
	}
   void sub1() 
   
   {
		
	   System.out.println("abstract method2");
	}
	
	void add() 
	{
		System.out.println("abstract method3");
	}
	
	void sub() 
	{
	
		System.out.println("abstract method4");
	}
   
	public static void main(String[] args) {
	
	new	Newclass().add();
	new Newclass().add1();
	new Newclass().div();
	new Newclass().sub();
	new Newclass().sub1();
	mul();
	}
	
	

}
