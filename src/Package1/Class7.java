package Package1;

public class Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Student narsa = new Student();
narsa.id=16201109;
narsa.name="Narsa Reddy";
narsa.age=21;
Student arun = new Student();
arun.id=943117;
arun.name="Arun Reddy";
arun.age=20;
System.out.println("ID of "+narsa.name +" is "+narsa.id);
System.out.println("ID of "+arun.name +" is "+arun.id);
	
		
		System.out.println("----------------------------------");

		

		narsa.setId(16201109);//see object for id or Id
		narsa.setName("Narsa Reddy");
		narsa.setAge(21);
		
		arun.setId(949116);
		arun.setName("Arun Reddy");
		arun.setAge(20);
		
		System.out.println("ID of "+narsa.getName() +" is "+narsa.getId());
		System.out.println("ID of "+arun.getName() +" is "+arun.getId());
		
	}

}
