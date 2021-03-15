package kr.ac.kopo.day06;

// 실행클래스 - 추상화 클래스가 아닌 클래스
public class CarMain {	// 실행 클래스와 참조 클래스는 가급적 따로 쓸 것, 차이 알기전까지
	public static void main(String[] args) {
	
		Car c = new Car();	// heap 영역에 자동차 한 대 생성
							// 주소값 저장할 참조변수 c 
		c.name = "소나타";
		c.price = 3200;
		c.company = "현대";
		
		Car c2 = new Car();

		c2.name = "K5";
		c2.price = 3000;
		c2.company = "기아";
		
		// c = c2;	// shallow copy - 유령영역 발생
		// heap은 브레이스 넘어가도 사라지지 않음, 메모리 손실
		// 안쓰는 영역을 지워줘야하지만, Java는 자동으로 지워줌 (garbage collector)
		
		System.out.println("모델명 : " + c.name + ", 가격 : " + c.price + "만원, 제조사 : " + c.company); 	// ctrl + space

		System.out.println("모델명 : " + c2.name + ", 가격 : " + c2.price + "만원, 제조사 : " + c2.company); 	// ctrl + space
		
	}
}