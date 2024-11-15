package legacyclass_stackclass_problem;

import java.util.Stack;

public class StackClass_Problem {

	public static void main(String[] args) {
		Stack<String> s1=new Stack<String>();
		s1.add("11");
        s1.add("12");
        s1.add("13");
        s1.add("14");
      //  System.out.println(s1);
        //s1.pop();
        System.out.println(s1);
        s1.peek();
        System.out.println(s1);
        s1.push("15");
        System.out.println(s1);
        s1.search("12");
        System.out.println(s1);
      }

}
