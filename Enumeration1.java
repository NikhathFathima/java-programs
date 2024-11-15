package java_basics_programs;

import java.util.Enumeration;
import java.util.Stack;

public class Enumeration1 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add("Nikhath");
		s1.add(20);
		s1.add('c');
		s1.add(null);
		
		java.util.Enumeration e1 = s1.elements();
		while(((java.util.Enumeration) e1).hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}

}
