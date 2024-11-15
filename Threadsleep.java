package throw_throws;

public class Threadsleep {

	public static void main(String[] args)throws NullPointerException, InterruptedException
	{
		System.out.println("niks");
		Thread.sleep(2000);
		System.out.println("student");
		throw new NullPointerException("Sorry the call is empty");

	}
 

}
