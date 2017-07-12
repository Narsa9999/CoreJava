package Package2;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume vol = new volume();
		vol.set(10,20,30);
		area surfarea = new area();
		surfarea.set(10, 20, 30);
       System.out.println("Surface Area =" + surfarea.Area());
       System.out.println("Volume =" + vol.Volume());
	}

}
