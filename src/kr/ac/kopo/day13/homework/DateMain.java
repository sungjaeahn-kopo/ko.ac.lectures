package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class DateMain {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선택하세요 (1. 특정년도 2. 특정월 3. 종료) => ");
		
		int choiceDate = sc.nextInt();
		sc.nextLine();
		
		switch(choiceDate) {
		
		case 1:		// 특정년도 출력
			int year = PrintCalendar.getYear();
			PrintCalendar.PrintCalendar(year);
			break;
			
		
		case 2:		// 특정월 출력
			year = PrintCalendar.getYear();
			int month = PrintCalendar.getMonth();
			
			PrintCalendar.PrintCalendar(year, month);

			break;
			
		case 3:		// 종료
			break;
		}
	}
}
