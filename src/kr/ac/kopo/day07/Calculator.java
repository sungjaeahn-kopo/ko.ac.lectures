package kr.ac.kopo.day07;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	boolean bool;
	
	int printNum1(){
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		return num1;
	}

	int printNum2(){
		System.out.print("정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		return num2;
	}
	/*
	 *  왜 안되는가?...
	void printCal(int num1, int num2) {
		System.out.println(num1+ " + " + num2 + " = " + plus(num1, num2));
	}
	*/
	void plus(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	void minus(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	void multiply(int num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	}
	
	void divide(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (double)(num1/num2));
	}
	
	void prime(int num) {
		int count = 0;
		for(int i = 1; i < num; i++) {	// 1로만 나눠지면 소수
			if(num % i == 0) {
				count++;
			}
		}
		boolean bool = (count == 1) ? true : false; 
		System.out.print(bool);
	}
	
	
	
	
}
