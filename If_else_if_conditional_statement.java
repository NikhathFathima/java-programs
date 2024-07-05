package conditional_blocks;

public class If_else_if_conditional_statement {

	public static void main(String[] args) {
		int no1=10;
		int no2=20;
		int no3=30;
		
		if(no1>no2)//no1<no2= true 
		{
			System.out.println("1");//only 1st block will execute
		}
		else if(no1>no3)
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("3");
		}
	}

}
