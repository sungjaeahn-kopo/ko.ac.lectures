package kr.ac.kopo.day16;

import java.io.Serializable;

/*
 	alt + shift + s 누른 후 c 선택	:	기본생성자
						  o 선택 :	매개변수를 가지는 생성자
 						  r 선택 :	getter/setter 메소드
 						  v 선택 :	override
 						  s 선택 :	toString() 메소드 오버라이드
 */

// 직렬화 인터페이스는 별도의 오버라이드 메소드 불필요

public class UserInfo implements Serializable{


	// 외부에서 private 직접 접근 안되므로 getta,setta 필요
	private String name;
	private transient int age;	// 객체 직렬화시 제외할 변수 (transient)
	private String addr;
	
	// 생성자 필요
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
