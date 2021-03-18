package kr.ac.kopo.day09;

public class Employee {

	private String name;
	private int salary;
	private String grade;
	private static int totalEmployee;
	
	//기본생성자
	Employee() {
		++Employee.totalEmployee;
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		++Employee.totalEmployee;
	}
	
	void info() {
		System.out.println("name : " + this.name + ", salary : " + this.salary + ", grade : " + this.grade);
		printTotalEmployee();
	}

	static void printTotalEmployee() {
		System.out.println("입사한 총 사원수 : " + Employee.totalEmployee + "명");
	}
	
	public String getName(){
		return this.name;
	}

	public int getSalary(){
		return this.salary;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}
	
}
