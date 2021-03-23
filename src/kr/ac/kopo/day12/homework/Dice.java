package kr.ac.kopo.day12.homework;

import java.util.Random;
import java.util.Scanner;

public class Dice implements Game {

	Scanner sc = new Scanner(System.in);
	
	int startGame(int you) {
		
		you = sc.nextInt();
		sc.nextLine();
		
		Random r = new Myrandom();
		int me = r.nextInt(6);		// 난수 1 ~ 6의 값
		
		if (me == you) {
			System.out.println("You win");
			return 1;
		}else {
			System.out.println("You lose");
			return 0;
		}
		
		
		
	}

	
	
	
	
	
}
