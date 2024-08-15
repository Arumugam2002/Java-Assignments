package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import connection.DBConnection;
import model.StudentModel;

public class StudentDao {

	public static void insertStudent(StudentModel s1)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			
			String sql = "insert into student(fname,lname,email,contact) values(?,?,?,?)";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, s1.getFname());
			pst.setString(2, s1.getLname());
			pst.setString(3, s1.getEmail());
			pst.setLong(4, s1.getContact());
			
		pst.executeUpdate();
		System.out.println("Data Inserted");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		
	}
	
	public static List<StudentModel> getAllData()
	{
		List<StudentModel> list = new ArrayList<StudentModel>();
		
		try {
			
			Connection conn = DBConnection.createConnection();
			
			String sql = "select * from student";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				StudentModel s1 = new StudentModel();
				s1.setId(rs.getInt("id"));
				s1.setFname(rs.getString("fname"));
				s1.setLname(rs.getString("lname"));
				s1.setEmail(rs.getString("email"));
				s1.setContact(rs.getLong("contact"));
				
				list.add(s1);
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		return list;
	}
	
	public static StudentModel getDataById(int id)
	{
		StudentModel  s1 = null;
		
		try {
			
			Connection conn = DBConnection.createConnection();
			

			String sql = "select * from student where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setInt(1, id);	
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				s1 = new StudentModel();
				s1.setId(rs.getInt("id"));
				s1.setFname(rs.getString("fname"));
				s1.setLname(rs.getString("lname"));
				s1.setEmail(rs.getString("email"));
				s1.setContact(rs.getLong("contact"));
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		return s1;
	}
	
	public static void updateData(StudentModel s1)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			
			String sql = "update student set fname = ?, lname =?, email = ?, contact = ? where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, s1.getFname());
			pst.setString(2, s1.getLname());
			pst.setString(3, s1.getEmail());
			pst.setLong(4, s1.getContact());
			pst.setInt(5, s1.getId());
			
			pst.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}
	
	public static void deleteData(int id)
	{
		try {
			
			Connection conn = DBConnection.createConnection();
			String sql = "delete from student where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}
	
	
	
	
}
