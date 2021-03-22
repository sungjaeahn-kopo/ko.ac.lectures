package kr.ac.kopo.day11.homework;

import java.util.Random;
import java.util.Scanner;

public abstract class Shape {

	static Scanner sc = new Scanner(System.in);
	
	public abstract void shapeArea();	// abstract 메소드
	
	public int randomNum() {	// 2 ~ 10 사이의 랜덤 변수 생성
		Random r = new Random();
		int n = r.nextInt(10)+1;
		return n;
	}
	
	public static void choice() {	// 도형 선택
		Shape s = null;		// 부모 클래스 Shape 참조변수 s 선언 및 초기화

		System.out.print("도형을 선택하세요 (1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원) => ");
		int choiceNum = sc.nextInt();
		sc.nextLine();
		
		switch(choiceNum) {
		
		case 1: 	// 직사각형
			s = new Rectangular();	//객체 형변환 (묵시적 형변환)
			// 부모 클래스	=	자식 클래스
			break;
			
		case 2:		// 정사각형
			s = new Square();	//객체 형변환 (묵시적 형변환)
			// 부모 클래스	=	자식 클래스
			break;
		
		case 3:		// 삼각형
			s = new Triangle();	//객체 형변환 (묵시적 형변환)
			// 부모 클래스	=	자식 클래스
			break;
		
		case 4:		// 원
			s = new Circle();	//객체 형변환 (묵시적 형변환)
			// 부모 클래스	=	자식 클래스
			break;
		}
		
		if(s != null)
			s.shapeArea();
		else {
			System.out.println("숫자 잘못 입력하였습니다");
		}
	}
}
