package kr.ac.kopo.day12.homework;

import java.util.Random;
import java.util.Scanner;

public class Dice implements Game {

	Scanner sc = new Scanner(System.in);

	public int getInfo() {
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위를 선택하세요(1~6값 중 하나)");

		int you = sc.nextInt();
		sc.nextLine();

		return you;
	}

	public int startGame(int you) {

		Random r = new Myrandom();
		int me = r.nextInt(6); // 난수 1 ~ 6의 값

		if (me == you)
			return 1;
		else
			return -1;

	}
}
