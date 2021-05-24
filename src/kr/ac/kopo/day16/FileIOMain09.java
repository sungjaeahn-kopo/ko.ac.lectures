package kr.ac.kopo.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// iodata/FileIOMain04.java -> iodata/FileIOMain04.java.txt 복사
public class FileIOMain09 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		// 외부 입출력이므로 예외처리 해줘야함
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("iodata/FileIOMain05.java");
			fw = new FileWriter("iodata/FileIOMain05_2.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				// readline() : os에 맞춰서 처리해줌
				bw.newLine();
			}
			bw.flush();
			
			System.out.println("파일 복사를 완료하였습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 항상 필터클래스를 먼저 close 해줘야 좋다
			FileClose.close(br,bw);
			FileClose.close(fr,fw);
		}
		
		
		
	}
	
}
