package kr.ac.kopo.day09;

public class StringUtil {
	
	public boolean isUpperChar(char c) {	// 1번
		if(c >= 'A' && c <= 'Z') { 
			return true;
		} // else
			return false;
	}
	
	public boolean isLowerChar(char c) {	// 2번
		if(c >= 'a' && c <='z') {
			return true;
		} // else
			return false;
	}
	
	public int max(int i, int j) {	//3번
		return i > j ? i : j;
	}

	public int min(int i, int j) {	// 4번
		return i > j ? j : i;
	}
	
	public String reverseString(String str) {
		String tmp = "";
		for(int i = tmp.length()-1; i >= 0; i-- ) {
			tmp += str.charAt(i);
		}
		return tmp;
	}

	public String toUpperString(String str) {
		String output = "";
		for(int i = 0; i < str.length()-1; i++) {
			
			int tmp = (int)str.charAt(i);
			
			if(tmp >= 97 && tmp <= 122) {
				output += (char) (tmp - 32);
			}else {
				output += (char)tmp;
			}
		}
		return output;
	}

	public String toLowerString(String str) {
		String output = "";
		for(int i = 0; i < str.length()-1; i++) {
			
			int tmp = (int)str.charAt(i);
			
			if(tmp >= 65 && tmp <= 96) {
				output += (char) (tmp + 32);
			}else {
				output += (char)tmp;
			}
		}
		return output;
	}
}
	
	
	

