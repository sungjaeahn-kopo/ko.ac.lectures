package kr.ac.kopo.day10.exam;

import java.util.Scanner;

public class IcecreamMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
			int i = 1;			// 인당 구매개수 매개변수 선언
			int count = 1;		// 구매 인원 매개변수 선언
			int totalNum = 0;		// 구매 총 개수 매개변수 선언
			int totalPrice = 0;
			
			byte yesOrNo = 'y';
			
			while(yesOrNo == 'y') {
			
				
				System.out.print("아이스크림 몇 개 구입할래? ");
				int num = sc.nextInt();		// 구매개수 입력

				if(i <= num) {
					
					System.out.println(i + "번");
					System.out.print("아이스크림명 : ");
					sc.nextLine();	// 아이스크림명 입력
					System.out.println();
				
					System.out.print("아이스크림가격 : ");
					int icecreamPrice = sc.nextInt();	// 아이스크림가격 입력
					sc.nextLine();		// 아이스크림 문자열 오류 방지
					System.out.println();

					System.out.println("출력");
					System.out.print("계속구매할래? (Y/N) => ");	
					yesOrNo = sc.nextByte();				// 재구매의사여부 입력
				
					totalNum = i;
					totalPrice += icecreamPrice;
					i++;
				}
				
				count++;
				
				
				
			}
			
			System.out.println("총 " + count + "명의 고객이 아이스크림을 구매했습니다" );
			System.out.println("판매된 아이스크림 총 개수 : " + totalNum);
			System.out.println("총 판매액 : " + totalPrice);
			
		
		
		
		
		
		
	}
	
}
