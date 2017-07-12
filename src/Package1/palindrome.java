package Package1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Enter The String = ");
		Scanner s = new Scanner(System.in);
		String original = s.nextLine(); 
	//String pal = "narsa";
	String reverse = "";
	int l = original.length();
	for(int i=l-1;i>=0;i--){
		 reverse = reverse+original.charAt(i);
	}
	//System.out.println(reverse);
	if(original.equals(reverse))//== works with integers but for strings string.equals(2nd string) 
		System.out.println("YES, It Is a PALINDROME");
	else
		System.out.println("NO It Is not a PALINDROME");
	}

}
