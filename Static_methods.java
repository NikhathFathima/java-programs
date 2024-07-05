package java__basics_prgms;

public class Static_methods {
	
	static void add()//static methods can call in main method by its name.
	{
		System.out.println("add of 2 numbers......");
	}
	//static void add()//duplication methods are not allowed in java
	//{
	//	System.out.println("add of 2 numbers");
	//}

	public static void main(String[] args) {
	
		System.out.println("main method is starting.........");
		add();//by its name
        add();
	}

}
