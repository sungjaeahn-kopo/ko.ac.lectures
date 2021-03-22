package kr.ac.kopo.day11.abs02;

public class SamsungPrinter extends Printer {

	/*
	public void samPrint() {
		System.out.println("삼성 프린터에서 출력중...");
	}
	*/
	
	@Override
	public void print() { // 재정의, override
		System.out.println("삼성 프린터에서 출력중...");
	}
	
}
