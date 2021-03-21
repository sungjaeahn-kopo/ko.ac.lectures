package kr.ac.kopo.day10.exam;

import java.util.Scanner;

public class IcecreamMarket {

	Scanner sc = new Scanner(System.in);
	
	int customerNum = 1;	// 구매 고객수 매개변수 선언
	int totalNum = 0;		// 구매 총 개수 매개변수 선언
	int totalPrice = 0;		// 구매 총 가격 매개변수 선언
	char decision = 'y';
	
	void buy() {
		int buyNum = inputInt("아이스크림 몇 개 구입할래? ");
		
		int i = 1;
		
		while(i <= buyNum) {
			System.out.println(i + "번");
			String iceName = inputName("아이스크림명 : ");
			int icePrice = inputPrice("아이스크림가격 : ");
			System.out.println();
			
			totalNum++;
			totalPrice += icePrice;
			
			if(i == buyNum) {
				decision = goStop();	// 재구매의사여부 입력
				break;
			}
			i++;
		}
	}
	
	int inputInt(String msg) {		// 구매개수 입력 메소드 생성
		System.out.print(msg);
		int buyNum = sc.nextInt();	// 구매개수 입력
		sc.nextLine();
		return buyNum;
	}
	
	String inputName(String msg) {			// 아이스크림 이름 입력 및 저장 메소드 생성
		System.out.print("아이스크림명 : ");
		String str = sc.nextLine();
		return str;
	}
	
	int inputPrice(String msg) {			// 아이스크림 가격 입력 및 저장 메소드 생성
		System.out.print("아이스크림가격 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	char goStop() {		// 재구매 의사여부 메소드 생성
		char yesOrNo = 'y';
		System.out.println("출력");
		System.out.print("계속구매할래? (Y/N) => ");
		yesOrNo = sc.next().charAt(0);
		
		return yesOrNo;
	}
	
	void doSomething() {
		char yesOrNo = 'y';
		
		while(yesOrNo == 'y') {
			buy();
			customerNum++;
			if(decision == 'n') {
				break;
			}
		}

		System.out.println("총 " + (customerNum-1) + "명의 고객이 아이스크림을 구매했습니다" );
		System.out.println("판매된 아이스크림 총 개수 : " + totalNum);
		System.out.println("총 판매액 : " + totalPrice);
		
	}
}
