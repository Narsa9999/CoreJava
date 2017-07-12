//To view or read a created class
package Package1;
import java.io.BufferedReader;//reads data in the file
import java.io.FileReader;//reads file
import java.io.IOException;
import java.io.*;


public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {
			FileReader fr = new FileReader("C:\\Users\\narsa\\Desktop\\Text.txt");
			br = new BufferedReader(fr);
			String line;
			while((line= br.readLine())!= null){
			System.out.println(line);
			}
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
