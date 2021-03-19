package kr.ac.kopo.day10;

class One {
	One() {
		System.out.println("One 생성자 호출...");
	}
}

class Two extends One {
	Two() {
		//super();	생략되어 있음
		System.out.println("Two 생성자 호출...");
	}
}

class Three extends Two {
	Three() {
		//super();	생략되어 있음
		System.out.println("Three 생성자 호출...");
	}
}


public class ExtendsMain {

	public static void main(String[] args) {
		new Three();
		
		
	}
	
}
