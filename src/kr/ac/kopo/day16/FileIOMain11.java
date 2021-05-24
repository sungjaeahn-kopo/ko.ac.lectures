package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIOMain11 {

	public static void write() throws Exception{
		UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");

		/*
		// 해당 데이터는 보고 싶지 않을때 사용 but, 비효율적!
		user.setAge(0);
		user.setAddr(null);
		// userinfo() 클래스에서 transient 추가 
		*/
		
		//객체 단위로 데이터를 저장 -> objectOutputStream
		FileOutputStream fos = new FileOutputStream("iodata/objectData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//객체가 가지고 있는 데이터 저장
		oos.writeObject(user);
		oos.flush();
		
		System.out.println("objectData.txt 저장완료");
		
	}
	
	public static void read() throws Exception{
		
		FileInputStream fis = new FileInputStream("iodata/objectData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//readObject의 반환형이 object형태이므로 명시적 형변환 필요
		UserInfo user = (UserInfo)ois.readObject();
		
		System.out.println("파일 로드 완료...");
		System.out.println(user);
		
	}
	
	public static void main(String[] args) {
		
		try {
			//write();
			read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
