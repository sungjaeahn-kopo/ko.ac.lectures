package kr.ac.kopo.day11.homework;

public class Circle extends Shape {
	int radian;
	
	public Circle() {
		this.radian = randomNum();
	}
	
	
	@Override
	public void shapeArea() {
		System.out.println("반지름이 " + radian + "인 원 면적은 " + (Math.PI * radian * radian) + "입니다");
	}

}
