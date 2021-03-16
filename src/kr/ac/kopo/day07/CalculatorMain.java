package kr.ac.kopo.day07;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator(); 
			// cal
		int num1 = cal.printNum1();
		int num2 = cal.printNum2();

		cal.plus(num1, num2);
		cal.minus(num1, num2);
		cal.multiply(num1, num2);
		cal.divide(num1, num2);
		
		boolean bool = true;
		
		System.out.print(num1 + " 소수체크 : ");
		cal.prime(num1);
		System.out.println();
		
		System.out.print(num2 + " 소수체크 : ");
		cal.prime(num2);
	}
}