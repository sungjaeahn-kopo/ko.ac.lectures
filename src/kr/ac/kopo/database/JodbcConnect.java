package kr.ac.kopo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JodbcConnect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String serverName = "192.168.119.119";
		String portNumber = "1521";
		String sid = "dink";
		String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
		String username = "scott";
		String password = "tiger";
		Connection conn = DriverManager.getConnection(url, username, password);

		//원하는 쿼리문 작성. 사용 예제는 select * from emp;

		String sql = "SELECT * from emp";
		Statement stmt = conn.createStatement();
		//쿼리 요청 및 반환
		ResultSet rs = stmt.executeQuery(sql);

		// 리스트 생성
		ArrayList<String> list = new ArrayList<String>();

		// 한줄 씩 쿼리 반환 값 리스트에 삽입
		while (rs.next()) {
			
			String current = rs.getString("ENAME");
			current = current + "\t" + rs.getString("SAL");
			current = current + "\t" + rs.getString("COMM");
			current = current + "\t" + rs.getString("DEPTNO");
			current = current + "\t" + rs.getString("JOB");
			list.add(current);
		}
		// 리스트 출력
		System.out.println("ENAME" + "\t" +  "SAL"+ "\t" + "COMM" + "\t" + "DEPTNO" + "\t" + "JOB"  );
		System.out.println("");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
