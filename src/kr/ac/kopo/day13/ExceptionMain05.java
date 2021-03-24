package kr.ac.kopo.day13;

import java.io.FileReader;

abstract class Parent {
	public abstract void print();
	public abstract void scan() throws Exception;
}

class Child extends Parent {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class ExceptionMain05 {

	public static void main(String[] args){	
								// JVM으로 예외처리를 넘김 (좋은 방법은 아님)
		Child obj = new Child();
		obj.print();
		try {
			obj.scan();
		} catch (Exception e) {
			
		}
		
		//b();
		
		/*
		try {
			b();
		} catch (Exception e) {
			System.out.println("main() 예외처리");
			e.printStackTrace();
		}
		*/
		
		//a();
	}
	
	public static void b() throws /*ArithmeticException, NullPointerException => */ Exception {	// 호출한 메인 메소드로 떠넘김
		System.out.println("b() 메소드 호출...");
		String str = null;
		System.out.println(str.charAt(0));
		System.out.println(1 / 0);
	}
	
	public static void a() { // 메인 메소드에서 a를 직접적으로 호출하기 위해 static
		System.out.println("a() 메소드 호출...");
		
		try {
			FileReader fr = new FileReader("a.txt");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
