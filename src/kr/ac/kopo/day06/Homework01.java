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
		System.out.println("아이스크림 몇 개 구입할거야? : ");
		int num = sc.nextInt();
		
		Icecream ice = new Icecream();
		ice.name = "비비빅";
		ice.price = 800;

		Icecream ice2 = new Icecream();
		ice.name = "브라보콘";
		ice.price = 1500;
		
		Icecream ice3 = new Icecream();
		ice.name = "구구콘";
		ice.price = 2000;
	
		Icecream ice4 = new Icecream();
		ice.name = "메로나";
		ice.price = 800;
		
		Icecream[] iceArr = {ice, ice2, ice3};
		
		for(int i = 0; i < num; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.println(" 아이스크림명 : " + iceArr[i].name);
			System.out.println(" 아이스크림가격 : " + iceArr[i].price);
			
			
			
		}
		
		
	}
	
}
