package Package1;
/*
 * try catch ; used when any exception occurs
 * finally always
 */
public class Class15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(retint());
	}
		public static int retint(){
			int a=100;
		try{
			a=a/0;
		return a;
		}catch(Exception f){//general catch exception comes last
			System.out.println("catch called");
			System.out.println(f);//catch works only if exception thrown
			return a;

		}finally{
					//a=5000;
					System.out.println("finally called");
					//return a;
                 }
		}
	

}
