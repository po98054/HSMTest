package Day45;

import java.sql.*;

import java.util.ArrayList;

public class StudentDBVerTeacher {
	
	private Connection con;
	
	private static Statement stmt;
	
	private static PreparedStatement pstmt;
	
	private static ResultSet rs;

	public StudentDBVerTeacher(String url, String id, String pw) throws Exception {

		connect(url, id, pw);
		
		stmt = con.createStatement();
		
	}
	
	private void connect(String url, String id, String pw) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection(url, id, pw);
		
		System.out.println("DB 연결 성공");
		
	}
	
	public ArrayList<Student> selectAllStudent2() throws SQLException {
		
		String sql = "select * from student";
		
		rs = stmt.executeQuery(sql);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		while(rs.next()) {
			
			String st_num = rs.getString(1);
			
			String st_name = rs.getString(2);
			
			int st_semester = rs.getInt(3);
			
			String st_state = rs.getString(4);
			
			String st_pr_num = rs.getString(5);
			
			Student std = new Student(st_num, st_name, st_semester, st_state, st_pr_num);
			
			list.add(std);
			
		}
		
		return list;
		
	}
	
	public void insertStudent(String st_num, String st_name, int st_semester, String st_state, String st_pr_num) throws SQLException{
		
		String sql = "insert into student(st_num, st_name, st_semester, st_state, st_pr_num) values(?, ?, ?, ?, ?)";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, st_num);
		
		pstmt.setString(2, st_name);
		
		pstmt.setInt(3, st_semester);
		
		pstmt.setString(4, st_state);
		
		pstmt.setString(5, st_pr_num);
		
		int count = pstmt.executeUpdate();
		
		if(count == 0) {
			
			System.out.println("추가 실패");
			
		} else {
			
			System.out.println("추가 성공");
			
		}
		
	}
	
}