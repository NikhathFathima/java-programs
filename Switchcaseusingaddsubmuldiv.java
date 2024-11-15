package switchcaseinjava;

import java.util.Scanner;

public class Switchcaseusingaddsubmuldiv {
	
	

	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in);
		 int a=s1.nextInt();	
	     int b=s1.nextInt();
	     int result = 0;
		
	     
	     switch(result)
	        {
	        	case 1:
	        		int sum=a+b;
	        		System.out.println("addition"+ sum);
	        	    break;
	        	    
	             case 2:
	            	 int sub=a-b;
		        		System.out.println("sub"+sub);
	        		System.out.println("lauching firfox browser");
	        	    break;
	        	    
	              case 3:
	            	  int c3=a*b;
		        		System.out.println("addition"+c3);
		            System.out.println("lauching firfox browser");
	                break;
	    
	               case 4:
	            	   int c4=a/b;
		        		System.out.println("division"+c4);
		               System.out.println("lauching firfox browser");
	                    break;
	}
	}
}


