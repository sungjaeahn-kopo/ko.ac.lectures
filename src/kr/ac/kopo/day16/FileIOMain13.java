package kr.ac.kopo.day16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class FileIOMain13 {

	public static void write() throws Exception{
		
		UserVO user = new UserVO("홍길동", 26, "010-1111-2222", "서울시 서초구");
		UserVO user2 = new UserVO("구길동", 30, "010-3333-4444", "경기도 광명시 철산동");
		UserVO user3 = new UserVO("윤길동", 28, "010-5555-6666", "서울시 송파구");
		
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("iodata/userList2.txt");
			oos = new ObjectOutputStream(fos);

			//list 파일 내 전체 저장해야하므로 for문 사용
			/*
			for(UserVO vo : list) {
				oos.writeObject(vo);
			}
			*/
			
			oos.writeObject(list);
			oos.flush();
			
			System.out.println("userList2.txt 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<UserVO> list = new ArrayList<>();
		
		try {
			fis = new FileInputStream("iodata/userList2.txt");
			ois = new ObjectInputStream(fis);
			
			/*
//			 listarray가 직렬화 상속받기 때문
	
			while(true) {
				try {
					UserVO user = (UserVO)ois.readObject();
//					System.err.println(user);
					list.add(user);
				} catch (EOFException e) {
					break;
				}
			}
			*/
			
			list = (List<UserVO>)ois.readObject();
			
			System.out.println("파일 로드 완료...");
			
			for(UserVO vo : list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			FileClose.close(ois);
			FileClose.close(fis);
		}
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

// arraylist 클래스도 직렬화 상속받을 수 있다! 
