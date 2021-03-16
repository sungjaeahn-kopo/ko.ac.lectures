package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Gugudan gu = new Gugudan();

		int dan = gu.getDan("2 ~ 9사이의 단 입력 : 3");	// return type - int, 돌아오는 매개변수 1개 -String
		
		/*
		System.out.print("2 ~ 9 사이의 단 입력 : ");
		int dan = gu.getDan();	// return type - int, 돌아오는 매개변수 0개
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.nextLine();
		*/
		
		gu.print(dan);		// return type - void, 돌아오는 매개변수 1개 - int
		
		gu.print();		// return type - void, 돌아오는 매개변수 0개
		
		int startDan = gu.getDan("시작단을 입력 : ");
		int endDan = gu.getDan("종료단을 입력 : ");
		
		/*
		System.out.println("시작단을 입력 : ");
		int startDan = gu.getDan();

		System.out.println("종료단을 입력 : ");
		int endDan = gu.getDan();
		*/
		
		gu.print(startDan, endDan);
	}
}
