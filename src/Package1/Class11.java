package Package1;

public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentsInTheClass mark=new StudentsInTheClass();
		System.out.println(mark.getstudentnumber());
		StudentsInTheClass tom=new StudentsInTheClass();
		System.out.println(tom.getstudentnumber());
	//shows errors because mark,tom are instances getstudentnumber is static and can be changed
	}

}
