package kr.ac.kopo.day08;

public class Icecream {	// 아이스크림 하나에 대한 정보를 작성해야함
						// 배열로 전체 정보를 작성하는건 옳지 않음
	String name;
	int price;
	
	void set(String n, int p) {
		name = n;
		price = p;
	}
	
	String getName() {	//icecreamMarket 클래스는 이름을 알지 못하기 때문
		return name;	//ice.name으로 기입하면 수정할 때 힘들다
	}
	
	int getPrice() {
		return price;
	}
	
}
