package kr.ac.kopo.day12.homework;

import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper implements Game {
	// 가위바위보 게임

	Scanner sc = new Scanner(System.in);

	final static int SCISSOR = 1; // 가위
	final static int ROCK = 2; // 가위
	final static int PAPER = 3; // 가위

	public int getInfo() {
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보 중 하나를 선택하세요.");
		System.out.println("1:가위, 2:바위, 3:보");

		int you = sc.nextInt();
		sc.nextLine();

		return you;
	}

	public int startGame(int you) {
		
		Random r = new Myrandom();
		int me = r.nextInt(3); // 난수 1 ~ 3의 값
								// AI 가위 바위 보 선택
		int result = 0;
		
		if (me == SCISSOR) {
			if (you == 1)
				result = 0;
			if (you == 2)
				result = 1;
			if (you == 3)
				result = -1;
		} else if (me == ROCK) {
			if (you == 1)
				result = -1;
			if (you == 2)
				result = 0;
			if (you == 3)
				result = 1;
		} else if (me == PAPER) {
			if (you == 1)
				result = 1;
			if (you == 2)
				result = -1;
			if (you == 3)
				result = 0;
		}

		return result;
		
	}
}
