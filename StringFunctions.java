package string_problems;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
          String name="nikhath";
         System.out.println( name.length());
         
      String a3=   name.toUpperCase();
          System.out.println(a3);
          
          String aname="Nikhath";
          String a=aname.toLowerCase();
          System.out.println(a);
          
          String a31="MY NAME IS NIKHATH";
          int a4=a31.length();
          System.out.println(a4);
          
          char a41=name.charAt(3);
            System.out.println(a41);
            
          boolean answer=  a31.contains("IS");
            System.out.println(answer);
            
            boolean answer1=  a31.endsWith("TH");
            System.out.println(answer1);
            
            String s1="manual";
       char[] c1=     s1.toCharArray();
       System.out.println(Arrays.toString(c1));
       
       String s2="50cent";
       char[] c2=     s2.toCharArray();
       System.out.println(Arrays.toString(c2));
	}

}
