package Package2;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// lets print factorial
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan1.nextInt(); 
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int a){
		if(a<1)
			return 1;
		else 
			return (a*factorial(a-1));
	}

	/*
	
	public static int sum(int a){
		if(a<1)
			return 0;
		else 
				return (a+sum(a-1));
	}*/
}
