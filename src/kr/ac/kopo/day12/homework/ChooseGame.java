package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class ChooseGame {

	public static int totalDraw;
	public static int totalWin;
	public static int totalDefeat;

	Scanner sc = new Scanner(System.in);

	public void gameMenu() {

		System.out.println("게임을 선택하세요");
		System.out.println("A. 가위바위보");
		System.out.println("B. 주사위 값 맞추기");
		System.out.println("C. 종료");

		char choice = sc.nextLine().charAt(0); // A B C 선택

		if (choice == 'A' || choice == 'B' || choice == 'C') {

			Game g;
			if (choice == 'A') {
				g = new ScissorRockPaper();
				int you = g.getInfo();
				int result = g.startGame(you);
				checkResult(result);
				gameMenu(); // 재귀호출

			} else if (choice == 'B') {
				g = new Dice();
				int you = g.getInfo();
				int result = g.startGame(you);
				checkResult(result);
				gameMenu(); // 재귀호출

			} else if (choice == 'C') {
				System.out.println("게임을 종료합니다");
				System.out.println("당신의 게임 전적은" + totalWin + "승" + totalDefeat + "패" + totalDraw + "무입니다.");

			} else {
				System.out.println("다시 입력하세요");
				gameMenu(); // 재귀호출

			}
		}
	}

	public void checkResult(int result) {

		if (result == 0) {
			System.out.println("DRAW");
			totalDraw++;
		} else if(result == 1) {
			System.out.println("WIN");
			totalWin++;
		} else {
			System.out.println("DEFEAT");
			totalDefeat++;
		}
	}
}
