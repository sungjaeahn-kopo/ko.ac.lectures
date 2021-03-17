package kr.ac.kopo.day08;

import java.util.Scanner;

public class StringMain02 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		char[] chars = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		
		// str.getChars(0, str.length(), chars, 0); length-1 까지 
		
		
		System.out.println("[" + str + "]의 길이 : " + str.length());
			// 문자열에서는 length()가 메소드
		System.out.println("0번째에 위치한 문자 : " + str.charAt(0));
		System.out.println("7번째에 위치한 문자 : " + str.charAt(7));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 : ");

		char c = sc.nextLine().charAt(0);	// "A"
		
		/*String input = sc.nextLine();	// "A"
		char c = input.charAt(0);
		*/
		
	}
}
