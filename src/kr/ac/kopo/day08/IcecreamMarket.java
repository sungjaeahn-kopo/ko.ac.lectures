package kr.ac.kopo.day08;

import java.util.Scanner;

public class IcecreamMarket {	// 아이스크림 배열을 저장하는 클래스
								// 마켓이 기능을 하도록 명령
								// main메소드 코드를 줄이기 위해 2번째 클래스 생성
	Icecream[] iceArr;			// 아이스크림 배열 멤버 변수
	Scanner sc = new Scanner(System.in);	// 정수나 문자 입력받기 위한
											// Scanner 멤버 변수
	//정수 입력
	int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	//문자 입력
	String inputString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	void doSomething() {
		// 손님 아이스크림 구매
		buy();
		
		// 구매정보 출력
		info();
	}
	
	void info() {	// 구매한 품목 출력
					// 입력받은 개수 info는 모르지만, iceArr는 알고 있음
		System.out.println("< 총 " + iceArr.length + "개 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		int no = 1;
		
		for(Icecream ice : iceArr) {
			/*
			System.out.println(no++ + "\t" + ice.name + "\t" + ice.price);
			 */
			System.out.println(no++ + "\t" + ice.getName() + "\t" + ice.getPrice());
			// 멤버변수가 아닌 메소드로 소통하ㅏㅏ자 (은닉성)
		}
	}
	
	void buy() {	// 동일한 클래스 내에서 XX.XXX라 하지 않음
		int count = inputInt("아이스크림 몇 개 구입할래? : ");	
		iceArr = new Icecream[count];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			String name = inputString("아이스크림명 : ");
			int price = inputInt("아이스크림가격 : ");
			
			iceArr[i] = new Icecream();
			iceArr[i].set(name, price);	// set 메소드 Icecream 클래스에 있어야함
		}
	}
}
