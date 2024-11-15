package switchcaseinjava;

import java.util.Scanner;

public class SwitchCase_prgm 
{

	public static void main(String[] args) 
	{
        Scanner s1=new Scanner(System.in);
        System.out.println("choose which browser to launch");
        System.out.println("Remember 1 for firefox, 2 for chrome, 3 for edge,4 for safari");
        int a=s1.nextInt();	
        
        switch(a)
        {
        	case 1:
        		
        		System.out.println("lauching firfox browser");
        	    break;
        	    
             case 2:
         		
        		System.out.println("lauching firfox browser");
        	    break;
        	    
              case 3:
	
	            System.out.println("lauching firfox browser");
                break;
    
               case 4:
	
	               System.out.println("lauching firfox browser");
                    break;
        }
	
	}

}
