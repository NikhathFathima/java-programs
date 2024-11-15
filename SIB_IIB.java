package sib_iib;

public class SIB_IIB {
	static//sib
	{
		System.out.println("SIB INVOKE");
	}
	{//iib
		System.out.println("IIB INVOKE");
	}
	public static void main(String[] args) {
          
		System.out.println("main method");
        new SIB_IIB();
	}

}
