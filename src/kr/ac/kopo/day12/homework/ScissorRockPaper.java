package kr.ac.kopo.day12.homework;

import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper implements Game {
	// 가위바위보 게임
	
	Scanner sc = new Scanner(System.in);
	
	final static int SCISSOR = 1;	//가위
	final static int ROCK = 2;	//가위
	final static int PAPER = 3;	//가위
	
	public ScissorRockPaper() {
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보 중 하나를 선택하세요.");
		System.out.println("1:가위, 2:바위, 3:보");
	}
	
	
	int startGame(int you) {
		
		you = sc.nextInt();		// 사용자 가위 바위 보 선택
		sc.nextLine();
		
		Random r = new Myrandom();
		int me = r.nextInt(3);		// 난수 1 ~ 3의 값
									// AI 가위 바위 보 선택
		if(me == you) {
			System.out.println("비겼습니다");
			return 0;
			
		}else if(me < you) {
			System.out.println("You lose");
			return 0;
		}else {
			System.out.println("You win");
			return 1;
		}
	}




	
}

class Myrandom extends Random{
	
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;
	}
}





