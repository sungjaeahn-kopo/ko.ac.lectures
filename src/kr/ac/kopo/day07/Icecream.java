package kr.ac.kopo.day07;

import java.util.Scanner;

public class Icecream {

	Scanner sc = new Scanner(System.in);
	
	
	
	void print(String msg) {
		
		System.out.println();
	
	}
	int print(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	String iceName() {
		String name = sc.nextLine(); 
		return name;
	}
	
	int icePrice() {
		int price = sc.nextInt();
		sc.nextLine();
		return price;
	}
	
	void iceInfo(int num) {
		Icecreamm[] ice = new Icecreamm[num];
		System.out.println("<총" + num + "개의 아이스크림 구매정보 출력>");
		System.out.println("번호" + '\t' + "아이스크림명" + '\t' + "아이스크림가격");
			for(int i = 0; i < num; i++) {
				ice[i] = new Icecreamm();
				System.out.println("" + (i+1) + '\t' + ice[i].name + '\t' + ice[i].price);
			}
	}
	
	
}
