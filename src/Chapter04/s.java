package Chapter04;

import java.util.Calendar;

public class s {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		
		String str = "";
		
		if(hour >= 4 && hour < 12)
			str = "Good Morning";
		else if(hour < 18) 
			str = "Good Afternoon";
		else if(hour < 22) 
			str = "Good Evening";
		else
			str = "Good Night";
		
		System.out.println(hour + "½Ã " + minute + "ºÐ");
		System.out.println(str);
	}
}
