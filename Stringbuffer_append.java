package stringbuffer_problems;

public class Stringbuffer_append {
	

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("Nikhath");
		sb1= sb1.append(" Fathima");
		System.out.println(sb1);
		
	    StringBuffer sb2=       sb1.insert(7, " Esrar");
		System.out.println(sb2);
		
		 StringBuffer sb= sb1.replace(7, 13, " Hasnain");
		 System.out.println(sb);
		 
		 StringBuffer sb3=sb1.delete(8, 15);//remove method in collection
		 System.out.println(sb3);
				 
		 StringBuffer sb4=sb1.reverse();//reverse the string
		 System.out.println(sb4);
		 
		 String sb5=sb1.substring(8, 14);
		 System.out.println(sb5);
		 
		char sb6=sb1.charAt(15);
		System.out.println(sb6);
		
		int sb7=sb1.length();
		System.out.println(sb7);
		
		int sb8=sb1.capacity();
		System.out.println(sb8);
		
		
		 
	}	

}


