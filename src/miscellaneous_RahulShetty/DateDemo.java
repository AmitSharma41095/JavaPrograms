package miscellaneous_RahulShetty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//Link to get all SimpleDateFormat codes
		//https://jenkov.com/tutorials/java-internationalization/simpledateformat.html#:~:text=Here%20is%20an%20example%20of,stringBuffer%2C%20new%20FieldPosition(0))%3B
		Date d = new Date();
		System.out.println(d.toString()); 	//Tue Feb 18 11:06:23 IST 2025
		
		//To format the data in format MM/dd/yyyy HH:MM:SS
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = sdf.format(d);
		System.out.println(formattedDate);		//02/18/2025
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf1.format(d));		//2025-02-18 11:14:51
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf2.format(d));		//2025-02-18 11:15:46.001 (in miliseconds)
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("EEEEE MMMMM yyyy HH:mm:ss.SSSZ");
		System.out.println(sdf3.format(d));		//Tuesday February 2025 11:16:59.831+0530
		
		
		

	}

}
