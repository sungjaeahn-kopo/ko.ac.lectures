package kr.ac.kopo.day10.exam;

import java.util.Random;

import java.util.Scanner;

public class ShapeChoice {
		
	Scanner sc = new Scanner(System.in);
	
	public int randomNum() {
		Random r = new Random();
		int n = r.nextInt(10) + 1;	// 2~10 사이의 랜덤 정수
		return n;
	}
	
	public void rectangular() {//변수 2개
		int width = randomNum();
		int height = randomNum();
		int area = width * height;
		
		System.out.println("Random하게 2~10사이의 정수 2개를 추출");
		System.out.println("가로 " + width + ", 세로 " + height + "의 직사각형 면적은 " + area + "입니다");
	}

	public void square() {	// 변수 1개
		int width = randomNum();
		int area = width * width;
		
		System.out.println("Random하게 2~10사이의 정수 1개를 추출");
		System.out.println("가로 " + width + "의 정사각형 면적은 " + area + "입니다");
	}

	public void triangle() {	// 변수 2개
		int width = randomNum();
		int height = randomNum();
		int area = width * height / 2;
		
		System.out.println("Random하게 2~10사이의 정수 2개를 추출");
		System.out.println("가로 " + width + ", 세로 " + height + "의 삼각형 면적은 " + area + "입니다");
	}

	public void circle() {		// 변수 1개
		int radian = randomNum();
		double area = Math.PI * radian * radian;
		
		System.out.println("Random하게 2~10사이의 정수 1개를 추출");
		System.out.println("반지름 " + radian + "의 원 면적은 " + area + "입니다");
	}

	public void choice() {
		
		System.out.print("도형을 선택하세요 (1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원) => ");
		int choiceNum = sc.nextInt();
		sc.nextLine();
		
		switch(choiceNum) {
		
		case 1:
			rectangular();
			break;
			
		case 2:
			square();
			break;
			
		case 3:
			triangle();
			break;
			
		case 4:	
			circle();
			break;
		}
	}
}

