package kr.ac.kopo.day14.homework;

public class LotteryMain {

	public static void main(String[] args) {
		
		LotteryView view = new LotteryView();
		
		view.normalMethod();	// Method 1. Normal Array
		
		view.hashMethod();		// Method 2. HashSet
		
		view.arrayList();		// Method 3. ArrayList
		
		view.back();
	}
	
}
