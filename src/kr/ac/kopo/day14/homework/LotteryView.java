package kr.ac.kopo.day14.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LotteryView {

	final int LOTTO_NUM = 6;	// 로또 개수 6개
	private Scanner sc;
	private Random r = new Myrandom();
	
	public LotteryView() {
		sc = new Scanner(System.in);
	}

	public int getInt(String msg) {
		
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	public void normalMethod() {	// Method 1. Normal Array 
		
		int gameNum = getInt("게임수를 입력하세요 : ");
		int[] numArr = new int[LOTTO_NUM];
		
		for(int j = 1; j <= gameNum; j++) {			// 복권 구입 개수
			System.out.print("게임 " + j + " : ");
			System.out.print("[");

			for(int i = 0; i < LOTTO_NUM; i++) {	// 1 ~ 45 로또 번호 난수 추출
				numArr[i] = r.nextInt(45);
				
				for(int k = 0; k < i; k++) 		// 숫자 중복 방지
					numArr[k] = (numArr[i] != numArr[k]) ? numArr[k] : numArr[i];
				
				System.out.print(numArr[i]);
				
				if(i != LOTTO_NUM - 1)			// 마지막 숫자에 , 포함되는 것 방지
					System.out.print(", ");
				else
					break;
			}
			System.out.println("]");
			
		}
		
	}
	
	public void hashMethod() {	// Method 2. HashSet
		
		int gameNum = getInt("게임수를 입력하세요 : ");	// Set은 중복을 허용하지 않으므로 추가 코드 불필요
		
		for(int j = 1; j <= gameNum; j++) {			// 복권 구입 개수
			HashSet<Integer> lottery = new HashSet<>();		// 게임 1, 2, 3 시작시 각각 초기화
			System.out.print("게임 " + j + " : ");
			
			for(int i = 0; lottery.size() < LOTTO_NUM; i++) {	// 1 ~ 45 로또 번호 난수 추출
				int num = r.nextInt(45);
				lottery.add(num);				// 숫자 추가
				
			}
			System.out.println(lottery);
			
		}
		
	}
	
	public void arrayList() {		// Method 3. ArrayList
		
		int gameNum = getInt("게임수를 입력하세요 : ");	

		List<Integer> lottery = new ArrayList<Integer>();
		
		for(int i = 1; i <= gameNum; i++) {
			while(lottery.size() < 6) {
				int num = r.nextInt(45);			// 1 ~ 45 로또 번호 난수 추출
				if(lottery.contains(num)) continue;	// 중복 여부
				lottery.add(num);
			}
			
			System.out.print("게임 "+ i +" : ");
			System.out.println(Arrays.toString(lottery.toArray()));
			lottery.clear();
		}
		
		System.out.println();
	}

	public void back() {		// Method 4. back : 중복 뒤로 빠꾸하는 메소드
		
		int gameNum = getInt("게임수를 입력하세요 : ");
		int[] numArr = new int[LOTTO_NUM];
		
		for(int j = 1; j <= gameNum; j++) {			// 복권 구입 개수
			System.out.print("게임 " + j + " : ");
			System.out.print("[");

			for(int i = 0; i < LOTTO_NUM; i++) {	// 1 ~ 45 로또 번호 난수 추출
				numArr[i] = r.nextInt(45);
				
				for(int k = 0; k < i; k++) {
					if(numArr[i] == numArr[k]) {
						i--;
						break;
					}
				}
				System.out.print(numArr[i]);
				
				if(i != LOTTO_NUM - 1)			// 마지막 숫자에 , 포함되는 것 방지
					System.out.print(", ");
				else
					break;
			}
			System.out.println("]");
			
		}
	}
}
