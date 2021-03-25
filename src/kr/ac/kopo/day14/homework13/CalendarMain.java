package kr.ac.kopo.day14.homework13;

public class CalendarMain {

	public static void main(String[] args) {

		CalendarView view = new CalendarView();
		view.process(); // main이 static 영역이므로 nonstatic 영역에서 변수 및 메소드 생성 후 넘김
		// 원래 public void process를 만들어야하지만, 실무에서는 편집기 기능으로 사용

	}
}
