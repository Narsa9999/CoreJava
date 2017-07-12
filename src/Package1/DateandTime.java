package Package1;
import java.text.*;
import java.util.Date;


public class DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());//prints date and time
		System.out.println(date.getTime());//prints ms from 1 jan 1970 epoch time
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getDay());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss:SS");//constructor takes standard format 
		System.out.println(sdf.format(date));
	}	

}
