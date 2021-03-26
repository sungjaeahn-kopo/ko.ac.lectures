package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;

//return 대상이 둘 이상인데 datatype이 다름 -> Object

class MemberInfo{
	private Member m;
	private Car c;
	
	MemberInfo(Member m, Car c){
		this.m = m;
		this.c = c;
		
	}
	
}

class Test{
/*	
	public Object[] returnTest() {	// 번지수마다 무엇이 들어있는지 알고,	method 1. object에 저장
									// 각각 명시적 형변환을 해줘야함
		Member m = new Member();
		Car c = new Car();
		
		Object[] arr = new Object[2];
		arr[0] = m;		// 묵시적 형변환
		arr[1] = c;		// 묵시적 형변환
		
		return arr;
	}
	
	public Map<String, Object> returnTest2() {		// method 2. map 사용
		
		Member m = new Member();
		Car c = new Car();
		
		Map<String, Object> map = new HashMap<>();
		map.put("member", m);
		map.put("Car", c);
		
		return map;
	}
*/
	public MemberInfo returnTest3() {				// method 3. 새로운 클래스 생성
		
		Member m = new Member();
		Car c = new Car();
		
		MemberInfo info = new MemberInfo(m, c);
		
		return info;
	}
	
}

// List는 중복허용되므로 안됨
// set은 등록차주를 알 수 없음
// map은 key와 value 한쌍이므로 가능

class Member{
	private String name;
	private String phone;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	
/*
	@Override
	public boolean equals(Object obj) {

		boolean result = false;
		
		Member mem = (Member)obj;	// 명시적 형변환
		
		if(name.equals(mem.name) && phone.equals(mem.phone)) {
			result = true;
			
		}
		
		// name.equals(obj.name)	// 명시적 형변환하기 전에는 member형변수이므로 안됨
		
		return result;
	}
	*/
	
}

class Car{
	private String name;
	private String id;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}


	
}

public class MapMain02 {

	public static void main(String[] args) {	// key, value 쌍 -> map
		
		Map<Member, Car> carList = new HashMap<Member, Car>();
		
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "12소1212"));
		carList.put(new Member("윤길동", "010-3333-4444"), new Car("모닝", "34가6354"));
		carList.put(new Member("박길동", "010-5555-6666"), new Car("그랜저", "26도1212"));
		carList.put(new Member("강길동", "010-7777-8888"), new Car("카니발", "81고1212"));
		
		System.out.println("등록대수 : " + carList.size());
		
		carList.put(new Member("홍길동", "010-8888-9999"), new Car("K3", "25다1212"));
		
		System.out.println("등록대수 : " + carList.size());

		carList.put(new Member("홍길동", "010-1111-2222"), new Car("제네시스", "42너1212"));
		// Map은 key값 비교시 '==' 이 아닌 equals()를 사용해서 비교
		// Object 클래스내에 정의되어 있는 equals() 메소드는 주소값을 비교하게 되어있다
		// -> 오버라이드 이용
		// 완전히 비교하려면 hashcod값도 비교해줘야한다 (hashcode 값도 같으면서 equals 값이 true여야 한다)
		
		
		System.out.println("등록대수 : " + carList.size());
		
		 
		
		
		
	
	}
	
}
