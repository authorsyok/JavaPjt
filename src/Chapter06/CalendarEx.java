package Chapter06;

import java.util.Calendar;

public class CalendarEx {
	
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfWeek = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		
		System.out.println(msg+year+"/"+month+"/"+day);
		
		switch(dayOfWeek) {
			case Calendar.SUNDAY: System.out.println("�Ͽ���"); break;
			case Calendar.MONDAY: System.out.println("������"); break;
			case Calendar.TUESDAY: System.out.println("ȭ����"); break;
			case Calendar.WEDNESDAY: System.out.println("������"); break;
			case Calendar.THURSDAY: System.out.println("�����"); break;
			case Calendar.FRIDAY: System.out.println("�ݿ���"); break;
			case Calendar.SATURDAY: System.out.println("�����"); break;
		}
		System.out.println("("+hourOfWeek+"��)");
		if(ampm == Calendar.AM) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
		System.out.println("========================================");
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("���� ", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("ó�� ����Ʈ�� ���� ", firstDate);
		
	}
}