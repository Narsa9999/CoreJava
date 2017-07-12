package Package1;
import java.util.*;
import java.sql.*;
public class Temporary {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		Enumeration e = DriverManager.getDrivers();
		while(e.hasMoreElements()){
		Driver d = (Driver)e.nextElement();
		System.out.println(d.getClass().getName());
		}

		}
		}