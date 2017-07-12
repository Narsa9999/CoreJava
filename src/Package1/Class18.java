package Package1;

import java.util.Scanner;

public class Class18 {

	public static void main(String[] args) {
		// multiplication table
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("upto which table ");
		
		
		int num = scan1.nextInt();
		System.out.println("enter the name ");
		String name =  scan1.next();
		
		for(int i=2;i<=num;i++){
			System.out.println("table: "+i);
			int prod;
			for(int j=1;j<=10;j++){
				prod = i*j;
				System.out.println(i+"*"+j+"="+prod);
			
			}
				
		}

	}

}
