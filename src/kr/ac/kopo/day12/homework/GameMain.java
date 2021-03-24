package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		print("게임을 선택하세요");
		print("A. 가위바위보");
		print("B. 주사위 값 맞추기");
		print("C. 종료");
		
		choiceChar();
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void choiceChar() {
		Scanner sc = new Scanner(System.in);
		
		char choice = sc.nextLine().charAt(0);
		
		if(choice == 'A') {
		
			
		}else if (choice == 'B') {
			
			
		}else {
			
			
		}
		
	}
}
