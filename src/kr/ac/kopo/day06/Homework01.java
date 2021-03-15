package kr.ac.kopo.day06;

import java.util.Scanner;

/*
  다음의 결과를 보이는 프로그램을 작성하시오.
  
  아이스크림 몇 개 구입할거야? : 4 (입력)
  
  *** 1번째 아이스크림 구매정보 입력 ***
  아이스크림명 : 비빅(입력)
  아이스크림가격 : 800(입력)

 *** 2번째 아이스크림 구매정보 입력 ***
  아이스크림명 : 브라보콘
  아이스크림가격 : 1500

 *** 3번째 아이스크림 구매정보 입력 ***
  아이스크림명 : 구구콘
  아이스크림가격 : 2000
 
 *** 4번째 아이스크림 구매정보 입력 ***
  아이스크림명 : 메로나
  아이스크림가격 : 800
  
  < 총 4개의 아이스크림 구매정보 출력 >
  번호	아이스크림명	아이스크림가격
  1		비비빅		800
  2		브라보콘		1500
  3		구구콘		2000
  4		메로나		800
  
  	총계 : 5100원
 */

public class Homework01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇 개 구입할거야? : ");
		int num = sc.nextInt();
		
		Icecream[] ice = new Icecream[num];	// num 크기만큼 배열을 heap 영역에 생성 및
									// new 연산자를 이용해 name, price 생성
		
		for(int i = 0; i < num; i++) {		// for문1 - 정보 입력 부분
			ice[i] = new Icecream();	// heap 영역에 인스턴스 객체 생성 및 
										// ice 배열에 주소값 저장
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			
			System.out.print(" 아이스크림명 : ");
			ice[i].name = sc.next();	// 키보드로 아이스크림명 입력 받음
			
			System.out.print(" 아이스크림가격 : ");
			ice[i].price = sc.nextInt();	// 키보드로 아이스크림가격 입력 받음
			
		}
		
		int total = 0;
		System.out.println("< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호" + '\t' + "아이스크림명" + '\t' + "아이스크림가격");

		for(int i = 0; i < num; i++) {	// for문 2 - 영수증 출력 부분
			System.out.print(i+1);	// 아래 문장과 같이 사용하면 오류, why? i=9로 인식
			System.out.println('\t' + ice[i].name + '\t' + '\t' + ice[i].price);
			total += ice[i].price;
		}

		System.out.println();
		System.out.println('\t' + "총계 : " + total + "원");
	}
	
}
