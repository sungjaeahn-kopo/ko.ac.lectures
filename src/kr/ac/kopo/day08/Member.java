package kr.ac.kopo.day08;

public class Member {

	String name;
	int age;
	String bloodType;

	// 생성자 위치 : 멤버변수와 메소드 사이
	
	Member(){	// 초기값을 자바에서 제공하는 null, 0 이 아닌 다른 값으로 하기 위함
		this("알수없음"
				
				);
	}
	
	Member(String name){
		this(name, -1);
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");	//this 생성자 무조건 첫줄에 명시! & 한번만 가능
		
	}

	Member(String name, int age, String bloodType){
		this.name = name;	// 지역변수가 우선!, 동일한 변수사용 주의!
		// 이런 경우에는 this. 생략불가
		this.age = age;
		this.bloodType = bloodType;
	}
	
/*	Member(){	// 초기값을 자바에서 제공하는 null, 0 이 아닌 다른 값으로 하기 위함
		this("알수없음", -1, "알수없음");
	}
	
	Member(String name){
		this(name, -1, "알수없음");
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");	//this 생성자 무조건 첫줄에 명시! & 한번만 가능
		
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;	// 지역변수가 우선!, 동일한 변수사용 주의!
		// 이런 경우에는 this. 생략불가
		this.age = age;
		this.bloodType = bloodType;
	}
*/	
	
	
/*	Member(){	// 초기값을 자바에서 제공하는 null, 0 이 아닌 다른 값으로 하기 위함
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name){
		this.name = name;	// 지역변수가 우선!, 동일한 변수사용 주의!
		// 이런 경우에는 this. 생략불가
		this.age = -1;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age){
		this.name = name;	// 지역변수가 우선!, 동일한 변수사용 주의!
		// 이런 경우에는 this. 생략불가
		this.age = age;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;	// 지역변수가 우선!, 동일한 변수사용 주의!
		// 이런 경우에는 this. 생략불가
		this.age = age;
		this.bloodType = bloodType;
	}
	*/
	
	
	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
		
	}
}
