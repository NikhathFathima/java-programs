package this_keyword;

public class This_keyword {
	int age;
	String name;
	double salary;
	void student_details(int age,String name,double salary)
	{
	  /* System.out.println(age);
	   System.out.println(name);
	   System.out.println(salary);*/
		
		this.age=age;//local to global
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) 
	{
		This_keyword t1=new This_keyword();
		t1.student_details(25,"Ram", 78787);
		System.out.println(t1.salary);
		System.out.println(t1.name);
		System.out.println(t1.age);

	}

}
