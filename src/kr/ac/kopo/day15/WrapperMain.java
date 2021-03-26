package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.List;

/*
 		첫글자를 대문자로 씀, 기본자료형을 쓰지 못하고 클래스를 써야할 때
 		기본자료형을 참조자료형화 시킨 것
 	기본자료형		Wrapper 클래스	 
 	boolean		Boolean
 	char		*Character*
 	byte		Byte
 	short		Short
 	int 		*Integer*
 	long		Long
 	float		Float
 	double		Double
 */

public class WrapperMain {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		int i = 123;
		Integer i2 = new Integer(123);	// 참조자료형이므로 인스턴스가 필요
		Integer i3 = 123;		// auto boxing, 문법적으로 이상, 기본자료형을 참조자료형으로 boxing
		int i4 = new Integer(123);	// auto unboxing, 문법적으로 이상, 참조자료형에서 기본자료형을 뽑아옴
		
		System.out.println("i : " + i);
		System.out.println("i2 : " + i2);
		System.out.println("i3 : " + i3);
		
		String str = "10234";
//		int num = Integer.parseInt(str);
		int num = Integer.valueOf(str);	//String. -> 문자로 변경, Integer -> 숫자로 변경
		
		// return 값 차이
		// valueOf - 참조자료형변수 return
		// parseInt - 기본자료형변수 return
		
		System.out.println(num + 100);
		
	}
	
}
