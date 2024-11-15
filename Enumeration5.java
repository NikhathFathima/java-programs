package calling_statements;


import java.util.Stack;

import collection.Enumeration;

public class Enumeration5 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add("nikhath");
		s1.add(null);
		s1.add('c');
		s1.add(345);
		
		java.util.Enumeration e1=s1.elements();
		while((boolean)e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}

}
