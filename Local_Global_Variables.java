package java_basics_programs;

public class Local_Global_Variables 
{

	int age=90;//non static 
	static double salary=20000.89;//static variable
	
	static void add()
	{
		
	}
	public static void main(String[] args) 
	{
		System.out.println(salary);
		Local_Global_Variables l1=new Local_Global_Variables();
		
		System.out.println(l1.age);

	}

}
