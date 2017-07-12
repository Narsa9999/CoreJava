package Package1;
import java.util.*;
public class bubblesort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n= s.nextInt();
		int array[]=new int[5];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++){
			array[i] = s.nextInt();
		}
		/*for(int i=0;i<n;i++){
		System.out.print(array[i]+"\t");
		}*/

		for(int i=0;i<n-1;i++){//only for iteration
			
			for(int j=i;j<=n-1;j++){
				if(array[i]>array[j])
				{
					
					  int temp = array[i];
					  array[i]=array[j];
					  array[j]=temp;
					 
				}
				
			}
		}
		System.out.println("Sorted elements are");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+"\t");
			}

	
	
	}
	
}
