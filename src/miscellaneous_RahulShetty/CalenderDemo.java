package miscellaneous_RahulShetty;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));		//2025-02-18 11:27:29
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));	//18
		System.out.println(cal.get(Calendar.AM_PM));		//0  - 0 AM 1 PM
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));	//3  - 0 sunday....
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));	//49
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	//11
	}
}
