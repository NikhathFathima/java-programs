package java_basics_programs;

public class HowToUpdateGlobalVariablevalue 
{
	int age=30;//non static variable
	static String name="Nikhath";//static global variable

	public static void main(String[] args)
	{
		name="Esrar";//updating static global variable
		System.out.println(name);
		
		HowToUpdateGlobalVariablevalue h1=new HowToUpdateGlobalVariablevalue();
		
		System.out.println(h1.age);
		
		System.out.println(h1.age=90);
	}

}
