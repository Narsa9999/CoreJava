package Package1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		/*for(int i=1;i<=n;i++){
			int c=0;
			for(int j=1;j<=i;j++){
				
				if(i%j==0){
					c++;
				}
				
			}
			if(c==2){
				System.out.println(i);
			}
		}*/
		int c=0;
		for(int j=1;j<=n;j++){
			
			if(n%j==0){
				c++;
			}
			
		}if(c==2){
			System.out.println("yes it is prime number");
		}else
			System.out.println("No it is not prime number");

	}

}
