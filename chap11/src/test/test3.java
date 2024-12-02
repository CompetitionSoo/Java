package test;

import java.util.Calendar;

public class test3 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH) + 1;
		//int day = now.get(Calendar.DATE);
		//int weekday = now.get(Calendar.DAY_OF_WEEK);

		// 10월 미만은 월 앞에 0을 붙일것인지 설정할수 있따 ("0"+month) 
		String strMonth = (month<10)? ("0"+month) : (""+month);
		
		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth = (dayOfMonth<10)? ("0"+dayOfMonth) : (""+dayOfMonth);

		//요일
		String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = dayArray[dayOfWeek-1] + "요일";
		
		//시간
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String strHour = (hour<10)? ("0"+hour) : (""+hour);
		
		//초
		int second = now.get(Calendar.SECOND);
		String strSecond = (second<10)? ("0"+second) : (""+second);
		
		System.out.print(year + "년 ");
		System.out.print(strMonth + "월 ");
		System.out.print(strDayOfMonth + "일 ");
		System.out.print(strDayOfWeek + " ");
		System.out.print(strHour + "시 ");
		System.out.print(strSecond + "분 ");
	}
}



		
		


