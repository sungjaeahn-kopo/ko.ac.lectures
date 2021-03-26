package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 	iodata/dog.jpg(입력) -> iodata/dog2.jpg(출력) 복사
 *  파일 내용을 ram으로 가져오고 ram에서 다시 파일로 가져감
 *  
 *  작업순서
 *  1. stream open
 *  2. read/write
 *  3. stream close
 *  
 */

public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//	1. stream open
			FileInputStream fis = new FileInputStream("iodata/dog.jpeg");
			FileOutputStream fos = new FileOutputStream("iodata/dog2.jpeg");
		
			//	2. read / write
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}

			
			System.out.println("복사완료...");		// stream을 끊어야 다른 사람이 볼 수 있음
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//	3. stream close .. 성공 실패여부 상관없이 닫아야하므로
			try {
				fis.close();	// checked exception 발생 가능
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}
