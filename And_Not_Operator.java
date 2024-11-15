package logical_operators;

public class And_Not_Operator {

	public static void main(String[] args) {
		int age=26;
		int salary=30000;
		
		if(!(age==18 && salary==10000))//false----(!(false)=true
		{
			System.out.println("I will not execute if both are false");
		}
		if(!(age==26 && salary==20000))//false---(!(false))=true
		{
			System.out.println("I will not execute if one true and one false");
		}
		if(!(age>=26 && salary==30000))//true--!(t)=false
		{
			System.out.println("I will only execute if both are true");
		}

	}

}
