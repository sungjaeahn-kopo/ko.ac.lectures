package kr.ac.kopo.day14.homework13;

import java.util.Calendar;

public class CalendarUtil { // 달력 기능 클래스

	private Calendar c;

	public CalendarUtil() {

		c = Calendar.getInstance(); // 전역변수로 선언해야 메모리 효율적으로 사용가능
	}

	public void showDayByYear(int year) { // 해당년도

		for (int month = 1; month <= 12; month++) { // 해당월 포함 시키면 좋을듯
			showDayByMonth(year, month);

		}

	}

	/*
	 * 필요한 정보 1.해당월의 마지막 날?
	 * 
	 * 2.1일이 무슨 요일인가?
	 * 
	 */

	public void showDayByMonth(int year, int month) {
		// Calendar c = Calendar.getInstance();

		// year/month-1 로 날짜정보 변경
		c.set(year, month - 1, 1);

		// month/1의 요일?
		int week = c.get(Calendar.DAY_OF_WEEK);

		// month의 마지막날 수?
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("<< " + year + "년 " + month + "월 >>");
		showDay(week, lastDay); // util 클래스내에서만 공유할 것이므로 private

	}

	private void showDay(int week, int lastDay) {
		System.out.println("--------------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------------");
		int cnt = 0;

		for (int i = 1; i < week; i++) {
			System.out.print("\t");
			cnt++;
		}

		for (int day = 1; day <= lastDay; day++) {
			System.out.print(day + "\t");
			if (++cnt % 7 == 0)
				System.out.println();
		}
		if (cnt % 7 != 0)
			System.out.println();
		System.out.println("--------------------------------------------------------");

	}

}
