package kr.ac.kopo.day11.homework;

public class Square extends Rectangular {

	int side;	// 정사각형 한 변 길이
	
	public Square() {
		this.side = randomNum();
	}
	
	@Override
	public void shapeArea() {
		System.out.println("한 변이 " + side + "인 정사각형 면적은 " + (side*side) + "입니다");
	}
	
}
