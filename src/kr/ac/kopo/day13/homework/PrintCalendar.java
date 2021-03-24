package kr.ac.kopo.day13.homework;

import java.util.Calendar;
import java.util.Scanner;

public class PrintCalendar {

	static Scanner sc = new Scanner(System.in);
	

	public static int getYear() {

		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		sc.nextLine();

		return year;
	}

	public static int getMonth() {

		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		sc.nextLine();

		return month;
	}

	public static void PrintCalendar(int year, int month) {

		String[] dayArr = { "", "일", "월", "화", "수", "목", "금", "토" };

		System.out.println("<< " + year + "년 " + month + "월 >>");

		for (int j = 1; j <= 7; j++) {
			System.out.print(dayArr[j] + "\t");

		}

		printMonth(year, month-1);

		System.out.println();

	}

	public static void PrintCalendar(int year) {	//case 1

		String[] dayArr = { "", "일", "월", "화", "수", "목", "금", "토" };

		for (int i = 1; i <= 12; i++) {	// 1월 ~ 12월

			System.out.println("<< " + year + "년 " + i + "월 >>");

			for (int j = 1; j <= 7; j++) {	// 일 ~ 토 [요일찍기]
				System.out.print(dayArr[j] + "\t");

			}
			printMonth(year , i - 1); // [숫자찍기]


		}
	}
	public static void printMonth(int year , int month) {
		
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, month-1);
		// year년 month-1 월로 설정
		int day = c.get(Calendar.DAY_OF_WEEK);
		
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//System.out.println(lastday);
		
		for(int i = 1 ; i < lastday ; i ++) {
			if(day == 7) {
				System.out.println();
			}
			
			System.out.print("\t" + i);
		}
		
		
		
		
	}

}
