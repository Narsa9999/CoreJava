package Package2;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rec = new rectangle();
		triangle tri = new triangle();
		rec.setvalues(10,10);
		tri.setvalues(10,10);

		System.out.println("Area of Rectangle = "+rec.area());
		System.out.println("Area of Triangle = "+tri.area());
	}

}
