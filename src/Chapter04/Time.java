package Chapter04;

import java.util.Calendar;

public class Time {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
		System.out.println(hourOfDay);
		System.out.println(minute);
	}
}
