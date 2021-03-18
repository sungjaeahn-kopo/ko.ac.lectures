package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "hello world";
		
		System.out.println("str : " + str);
		
		String substr = str.substring(1, 5);	//5는 포함되지 않음
		
		System.out.println("substring(1,5) : [" + substr + "]");
		
		
		
		String str1 = "hello";
		String str2 = "!!!!";
		
		str = str1.concat(str2);
		System.out.println("concat(str1, str2) 결과 " + str);
		
		
		str = "hello world";
		System.out.println("replace() 전 : " + str);
//		str = str.replace('1', 'r');
		str = str.replace("ll", "rrrrrr");
		System.out.println("replace() 후 : " + str);
		
		str = "			hello world			";	// 좌우 공백만 지워줌, 중간 공백은 무시
		System.out.println("trim() 전 [" + str + "] 길이 : " + str.length());
		str = str.trim();
		System.out.println("trim() 후 [" + str + "] 길이 : " + str.length());
		
		str = "홍길동전:허균:조선시대";
		String[] strArr = str.split(":");	// : 기준으로 문자열 나눔
		System.out.println(Arrays.toString(strArr));
		
		String ip = "192.168.5.203";
		String[] ipArr = ip.split("\\.");	// //안쓰면 .을 인식못함
		System.out.println(Arrays.toString(ipArr));
	}
	
}
