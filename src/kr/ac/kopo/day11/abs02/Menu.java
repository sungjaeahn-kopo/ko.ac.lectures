package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu {

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("LV2프린터를 선택하세요 (1.LG 2.삼성 3.HP) => ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	
	public void choice() {
		
		int type = selectMenu();
		print(type);
		
	}

	public void print(int no) {
		
		Printer p = null;		// 부모 클래스 변수 생성
								// 자식의 인스턴스 객체값을 부모가 가질 수 있다
		
		switch(no) {
		
		case 1:
			p = new LGPrinter();	// 자식의 인스턴스 객체값을 부모가 가질 수 있다22
			//p.print();
			break;
			
		case 2:
			p = new SamsungPrinter(); // 자식의 인스턴스 객체값을 부모가 가질 수 있다33
			//p.print();
			break;
			
		case 3:
			//p = new HPInkjetPrinter(); // 자식의 인스턴스 객체값을 부모가 가질 수 있다44
			p = new HPLaserPrinter();
			//p.print();
			break;
		
		}
		
		if(p != null)
			p.print();
		else {
			System.out.println("잘못 선택하셨습니다");
		}
	}
}
