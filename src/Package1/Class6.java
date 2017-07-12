package Package1;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Methods in Java
		SayHi();
		SayHai("Aleti");// single char single quotes string in double quotes
		add(100,200,300);
		int avg=add(1000,2000,3000)/3;
		System.out.println(avg);
		}
	
//Defining methods outside the main and calling anywhere inside the class
public static void SayHi(){
	System.out.println("hii narsa");
    }
//passing parameter
public static void SayHai(String lastname)//see syntax datatype variablename as parameter
{
	System.out.println("hii narsa "+lastname);
}
/*                     //some math
public static void add(int a,int b,int c)
{
System.out.println(a+b+c);
}*/
//some math with returns
public static int add(int a,int b,int c)
{
	System.out.println(a+b+c);
	return(a+b+c);
}

}