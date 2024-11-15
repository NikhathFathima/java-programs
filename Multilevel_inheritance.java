package inheritance;
class add
{
static void method_add()
{
	System.out.println("add");
}
}
class sub extends add
{
	static void method_sub()
	{
		System.out.println("sub");
	}
}

public class Multilevel_inheritance extends sub {
	static void mul()
	{
		System.out.println("mul");
	}

	public static void main(String[] args) {
		method_sub();
		mul();
method_add();

	}

}
