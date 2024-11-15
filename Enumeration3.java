package java_basics_programs;

import java.util.Stack;

import collection.Enumeration;

public class Enumeration3 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add("nikhath");
		s1.add(900);
		s1.add('c');
		s1.add(null);
		
	java.util.Enumeration e1=s1.elements();
	while(((java.util.Enumeration )e1).hasMoreElements())
	{
System.out.println(e1.nextElement());
	}

	}
}
	
