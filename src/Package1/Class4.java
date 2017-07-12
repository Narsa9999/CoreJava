package Package1;


public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Arrays
		int[] array={21,58,65,84,03};
		int index=0;
		
		for(index=0;index<5;index++){
			System.out.println(array[index]);
			
		}
		System.out.println("------------------------------------");
		
		for(int element:array)    //int corresponds to datatype of "array".
			//element is the keyword jumps over indexes
		{
			
			System.out.println(element);   //so it elements one by one
			
		}
		
	}
}
