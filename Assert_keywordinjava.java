package assert_keyword;

public class Assert_keywordinjava {

	public static void main(String[] args) {
		/*String name="Nikhath";
		assert name.length()>1;//condition is false  (without message)
		
	System.out.println(name.concat(" Fathima"));
*/
		
		int a=10;
		int b=20;
		assert a>5:"sorry the condition is false";//(with msg)if the condition is true then message will not appear if it is failed then msg will appear
		int sum = a+b;
		System.out.println(sum);
	}

}
//postman-assert
//j meter(performance testing tool)-assert
//load runner(''')-asssert
//burpsuite(penetration testing tool or web security testing)-assert
//automation with selenium(front end automation)-assert
//automation with rest assured(backend end automation)-assert
//appium(mobile testing tool in automation)-assert