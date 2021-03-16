package kr.ac.kopo.day07;

import java.util.Scanner;

public class Icecream {

	String name;	// Icecream 객체의 name 변수 선언
	int price;		// Icecream 객체의 price 변수 선언
	
	Scanner sc = new Scanner(System.in);
	
	String getIceName() {	// 아이스크림 이름 입력 메소드
		System.out.print("아이스크림명 : ");
		String s = sc.nextLine();
		return s;	// parameter X
	}				// return type - String
	
	int getIcePrice() {		// 아이스크림 가격 입력 메소드
		System.out.print("아이스크림 가격 : ");
		int n = sc.nextInt();
		sc.nextLine();	// int형 입력시 오류 방지!
		return n;	// parameter X
	}				// return type - int
	
	void iceInfo(int num, Icecream[] iceArr) {
		System.out.println("<총" + num + "개의 아이스크림 구매정보 출력>");
		System.out.println("번호" + '\t' + "아이스크림명" + '\t' + "아이스크림가격");
			for(int i = 0; i < num; i++) {
				System.out.println("" + (i+1) + '\t' + iceArr[i].name + '\t' + '\t' + iceArr[i].price);
			}
	}
}
