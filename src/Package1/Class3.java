package Package1;

import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * getting user inputs
 */
Scanner scan = new Scanner(System.in);
System.out.println("Enter some number");
int user_input_number=scan.nextInt();
System.out.println("Entered number is :");
System.out.print(user_input_number);
Scanner scan1 = new Scanner(System.in);
System.out.println("Enter some string");
String user_input_string=scan1.nextLine();
System.out.println("Entered string is :");
System.out.print(user_input_string);
}
}
