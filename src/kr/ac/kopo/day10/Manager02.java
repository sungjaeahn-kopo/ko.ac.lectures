package kr.ac.kopo.day10;

// 관리자 클래스
public class Manager02 extends Employee{

	Employee[] empList;	// 관리 사원 목록
	
	Manager02(int no, String name, int salary, String grade, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	// 부모클래스의 메소드를 재정의
	@Override
	void info() {
		super.info();
		System.out.println("사원번호 : " + no + ", 사원명 : " + name
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
		System.out.println("=============================================");
		System.out.println("\t관리사원 목록");
		System.out.println("=============================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("=============================================");
	}
}
