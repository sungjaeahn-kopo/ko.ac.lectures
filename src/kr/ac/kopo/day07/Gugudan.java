package kr.ac.kopo.day07;

import java.util.Scanner;

/**
 * 구구단과 관련된 여러가지 기능을 가지는 기능클래스
 * @author da
 *
 */

public class Gugudan {

	Scanner sc = new Scanner(System.in);// 구구단 클래스의 멤버변수로 바꿈
				// 구구단 내 모든 메소드는 멤버변수를 모두 볼 수 있음
	
	void print(int dan) {
		System.out.println("***" + dan + "단 ***");
		for(int i = 0; i <=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	void print() {		// 메소드 오버로딩
/*		
		this.print(2);	// 자기참조 객체, this.생략가능
*/	
		
		// 방법 1. 시작 2 ~ 끝 9
		print(2, 9);
		
		/* 방법 2. 2에서 9까지 하나씩 반복 출력
		for(int dan = 2; dan <= 9; dan++ ) {
			print(dan);
		}
		*/
		
		/* 방법 3. 노가다		
		for(int dan = 2; dan <= 9; dan++ ) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		*/
		
	}
	
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param sDan 시작단
	 * @param eDan 종료단
	 */
	
	void print(int sDan, int eDan) {
		
		for(int dan = sDan; dan <= eDan; dan++) {
/*
 			System.out.println("*** " + dan + "단 ***");
*/
			print(dan);		//위 문장과 동일
		}
	}
	
	int getDan() {
		/*
		Scanner sc = new Scanner(System.in);
		*/
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}

	int getDan(String msg) {
		/*
		System.out.println(msg);
		*/
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
}
