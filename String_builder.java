package stringBuilder_programs;

public class String_builder {

	public static void main(String[] args)
	{
		StringBuilder sb1=new StringBuilder("Nikhath");
		StringBuilder	s=sb1.append(" Fathima");
		System.out.println(s);
		
		StringBuilder sb2=sb1.append('a');
		
		System.out.println(sb2);
		
		 StringBuilder sb9=       sb1.insert(7, " Esrar");
			System.out.println(sb9);
			
			 StringBuilder sb= sb1.replace(7, 13, " Hasnain");
			 System.out.println(sb);
			 
			 StringBuilder sb4=sb1.delete(8, 15);//remove method in collection
			 System.out.println(sb4);
					 
			 StringBuilder sb5=sb1.reverse();//reverse the string
			 System.out.println(sb5);
			 
			 String sb6=sb1.substring(8, 14);
			 System.out.println(sb6);
			 

	}

}
