package Package1;

public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello hello = new Hello();
System.out.print(hello.DoSomething("Narsa"));//dosomething is static--->class

Hello hello1 = new Hello();
	System.out.println(hello1.DoSomethingElse("Reddy"));// non static------>instance
	
/*Everything works with instance 
 * but non static works only with instance
 */
	}
}
