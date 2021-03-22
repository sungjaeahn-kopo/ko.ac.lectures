package kr.ac.kopo.day11.homework;

public class Rectangular extends Shape {

	int width;
	int height;
	
	public Rectangular() {
		this.width = randomNum();
		this.height = randomNum();
	}
	
	@Override
	public void shapeArea() {
		System.out.println("가로 " + width + ", 세로 " + height + "의 직사각형 면적은 " + (width*height) + "입니다");
	}

}
