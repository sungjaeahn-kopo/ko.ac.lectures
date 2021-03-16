package kr.ac.kopo.day07;

public class Homework01 {

	public static void main(String[] args) {
		
		Icecream ice = new Icecream();
		
		int num = ice.print("아이스크림 몇 개 구입할래? ");
		
		for(int i = 0; i < num; i++) {
			Icecreamm[] ice = new Icecreamm[num];
			ice[i] = new Icecreamm();
			
			ice.print(num);
			
			
			
			
			ice.iceInfo(num);
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
