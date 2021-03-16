package kr.ac.kopo.day07;

public class MethodMain01 {

	/**
	 * 임의의 문자를 반복하여 출력하는 기능
	 * @param c		출력할 문자
	 * @param cnt	출력횟수
	 */
	
	static int printStar(char c, int cnt){		// 반환형 메소드명 (변수) - 반환명과 메소드명은 항상 기입, 메소드 선언부
												// 피호출자
												// 반환형에 참조자료형이 들어갈 수도 있다
		for(int i = 0; i < cnt; i++) {
			System.out.print(c);
		}
		System.out.println();
		
		return 20;
	}
	
	public static void main(String[] args) {	// 호출자

		int data = printStar('*', 10);			// printStar 메소드 실행 명령
		System.out.println("Hello");
		printStar('!', 20);
		System.out.println("Hi");
		printStar('#', 5);
		System.out.println("Good-bye");
		printStar('-', 12);
		
	}
	
	
	
	
}
