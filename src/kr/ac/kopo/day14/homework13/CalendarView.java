package kr.ac.kopo.day14.homework13;

import java.util.Scanner;

public class CalendarView { // 클래스 이름 뒤에 UI / view 가 붙으면 기능클래스로 구성
							// 화면 생성 목적이므로 달력 기능 클래스는 새로 생성 권장
							// 키보드 입력과 같은 화면 구성
	private Scanner sc;

	public CalendarView() {
		sc = new Scanner(System.in);

	}

	public int getInt(String msg) {

		System.out.print(msg);
		int no = sc.nextInt();
		sc.nextLine();

		return no;
	}

	public void process() {

		CalendarUtil util = new CalendarUtil(); // 인스턴스 객체 생성 코드는 while 밖에 있어야 좋다
												// while문 안으로 가면 매번 새로 생성하므로 메모리 관리에 안좋다
		while (true) {

			int command = getInt("항목을 선택하세요 (1. 특정년도 2. 특정월 3. 종료) : ");
			int year, month;

			switch (command) {

			case 1:
				year = getInt("년도를 입력하세요 : ");
				util.showDayByYear(year);
				break;

			case 2:
				year = getInt("년도를 입력하세요 : ");
				month = getInt("월을 입력하세요 : ");
				util.showDayByMonth(year, month);
				break;

			case 3:
				System.out.println("프로그램을 종료합니다");
				System.exit(0); // 시스템 종료
				// break Loop;
			}
		}
	}
}
