//create a file and write in it
package Package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("NewFile1"); 
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println("line 1");
			pw.println("line 2");
			pw.println("line 3");
			pw.println("line 4");
			pw.println("line 5");
			pw.close();
			System.out.println("Done with creating");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
