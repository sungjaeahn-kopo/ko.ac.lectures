package kr.ac.kopo.day11.homework;

public class Triangle extends Shape {
	int width;
	int height;
	
	public Triangle() {
		this.width = randomNum();
		this.height = randomNum();
	}
	
	@Override
	public void shapeArea() {
		System.out.println("가로 " + width + ", 세로 " + height + "의 삼각형 면적은 " + (width*height/2) + "입니다");
	}

}
