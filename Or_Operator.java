package logical_operators;

public class Or_Operator {

	public static void main(String[] args) {
		int age=10;
		char gender='F';
		int salary=10000;
		
		if(salary==20000 || gender=='F')
		{
			System.out.println("I will execute if one is true");
		}
		if(!(salary==10000 || gender=='M'))
		{
			System.out.println("I will");
		}
		if(salary==100 || gender=='M')
		{
			System.out.println("I will NOT");
		}


	}

}
