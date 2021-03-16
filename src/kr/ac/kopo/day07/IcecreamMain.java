package kr.ac.kopo.day07;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Icecream Ice = new Icecream();	
			// Icecream 객체를 생성하고 주소값을 참조변수 Ice에 저장
		System.out.print("아이스크림 몇 개 구입할래? ");
		int num = sc.nextInt();
		Icecream[] iceArr = new Icecream[num];
			// Icecream형 배열 iceArr에 주소값 저장
		for(int i = 0; i < num; i++) {
			
			iceArr[i] = new Icecream();
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 ***");
			
			iceArr[i].name = Ice.getIceName();
				// 아이스크림명을 배열에 저장하는 메소드 호출
			iceArr[i].price = Ice.getIcePrice();
				// 아이스크림가격을 배열에 저장하는 메소드 호출
		}
			Ice.iceInfo(num, iceArr);
				// 아이스크림 구매정보 출력하는 메소드 호출
	}
}
