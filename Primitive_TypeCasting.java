package continue_keyword;

public class Primitive_TypeCasting {

	public static void main(String[] args) {
		//int into double
		
		double a1=100;//widning-implicitlt and explicitly
		System.out.println(a1);//implicitly
		
		double a2=(double)9987;//explicitly
		System.out.println(a2);
		
		//double into int
		
		int a3=(int)78.98;//narrowing is only possible explicitly
		System.out.println(a3);

		double wt=90.8787;
		int wt1=(int)wt;
		System.out.println(wt1);
		
	}
}
