package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

// 키보드 입력으로 값을 받는 작업

/*
 	JDBC 작업순서
 	1) 드라이버 로딩
 	2) DB접속 후 연결객체 얻기
 	3) SQL문 실행할 객체 얻기
 	4) SQL문 실행 및 결과 얻기
 	5) DB접속 해제
 */

// 기본적인 JDBC에서는 DDL을 사용하지 않음 (CREATE 등)


public class InsertMain02 {

	public static void main(String[] args) {
		
		// finally에서 처리하기 위해 try밖에서 별도 정의
		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		
		
		try {
			// 1단계 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			// 2단계 : DB 연결 후 Connection 객체 얻기
			String url 		= "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user 	= "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url,user,password); // connection 객체
			System.out.println("conn : " + conn);
			
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			
			System.out.print("이름을 입력 : ");
			String name = sc.nextLine();
			
			// 3단계 : SQL 실행객체 얻어오기
			stmt = conn.createStatement(); // prepared statement 객체
			// 습관적으로 빈칸을 포함해서 sql문을 넣을 것, 쿼리문 종결에 ; 포함하지 않음
			String sql = "insert into t_test(id, name) ";
				   sql += " values(\'" + id + "\', \'" + name + "\') ";
			
			// 4단계 : SQL문 실행 및 결과 얻기
			// executeUpdate 반환 값 int는 작업한 row개수를 의미
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 내부적으로 IO이기 때문에 중간에 에러가 발생해도 닫는 행위는 해야함!
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			sc.close();
		}
	}
}
