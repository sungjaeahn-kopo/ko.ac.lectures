package kr.ac.kopo.day07;

/*
 	메소드 오버로딩(Overloading)
 	: 같은 클래스 내에 동명의 메소드이면서
 	 매개변수의 개수 또는 타입이 다른 것
 */

public class Method {

	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String s) {
		System.out.println("call(String) 메소드 호출...");
	}

	void call(char c) {		// 이 문단이 없으면 'A'는 상위 자료형인 int로 묵시적형변환 발생
		System.out.println("call(char) 메소드 호출...");
	}

	void call(String s, boolean b) {		// 이 문단이 없으면 'A'는 상위 자료형인 int로 묵시적형변환 발생
		System.out.println("call(String boolean) 메소드 호출...");
	}
}