package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class LottoMain {

	static void LottoMain() throws LottoNumberException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		
		int likeNum = sc.nextInt();
		sc.nextLine();
		
		if(likeNum > 45 || likeNum < 1) {
			throw new LottoNumberException("1 ~ 45 사이만 가능합니다." + likeNum + "은 올바르지 않습니다");
		}
		System.out.println(likeNum + "를 포함해서 로또번호들을 추출하겠습니다");
		
	}
	
	
	public static void main(String[] args) {
		try {
			LottoMain();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	
}
