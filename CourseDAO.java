package com.del.second.dao;
import java.sql.*;
import java.util.ArrayList;
import com.del.second.entity.Course;
public class CourseDAO 
{
    public boolean insertCourse(Course crs)
    {
    	  int count = 0;
   	      Connection con = null;
		  PreparedStatement pst = null;
		  String url="jdbc:oracle:thin:@localhost:1521:orcl";
		  try
		  {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = DriverManager.getConnection(url,"scott","tiger");
			  pst = con.prepareStatement("insert into course values(?,?,?,?)");
			  pst.setInt(1, crs.getCourseid());  pst.setString(2, crs.getCoursename());
			  pst.setInt(3, crs.getCourseduration());  pst.setDouble(4, crs.getCoursefee());
			  count = pst.executeUpdate();
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(pst!=null) pst.close();
				  if(con!=null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
		  return count ==1;
	  }
      public boolean modifyCourse(Course crs)
     {
    	  int count = 0;
   	      Connection con = null;
		  PreparedStatement pst = null;
		  String url="jdbc:oracle:thin:@localhost:1521:orcl";
		  try
		  {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = DriverManager.getConnection(url,"scott","tiger");
			  pst = con.prepareStatement("update course set coursename=?,courseduration=?,coursefee=? where courseid=?");
			  pst.setString(1, crs.getCoursename());  pst.setInt(2, crs.getCourseduration());
			  pst.setDouble(3, crs.getCoursefee());  pst.setDouble(4, crs.getCourseid());
			  count = pst.executeUpdate();
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(pst!=null) pst.close();
				  if(con!=null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
		  return count ==1;
	  }
      public boolean removeCourse(int courseid)
      {
     	  int count = 0;
    	  Connection con = null;
 		  PreparedStatement pst = null;
 		  String url="jdbc:oracle:thin:@localhost:1521:orcl";
 		  try
 		  {
 			  Class.forName("oracle.jdbc.driver.OracleDriver");
 			  con = DriverManager.getConnection(url,"scott","tiger");
 			  pst = con.prepareStatement("delete from course where courseid=?");
 			  pst.setInt(1, courseid);
 			  count = pst.executeUpdate();
 		  }
 		  catch(Exception ex)
 		  {
 			  ex.printStackTrace();
 		  }
 		  finally
 		  {
 			  try
 			  {
 				  if(pst!=null) pst.close();
 				  if(con!=null) con.close();
 			  }
 			  catch(Exception ex)
 			  {
 				  ex.printStackTrace();
 			  }
 		  }
 		  return count ==1;
 	  }
      public Course getCourse(int courseid)
      {
     	  Course crs = null;
    	  Connection con = null;
 		  PreparedStatement pst = null;
 		  ResultSet rs = null;
 		  String url="jdbc:oracle:thin:@localhost:1521:orcl";
 		  try
 		  {
 			  Class.forName("oracle.jdbc.driver.OracleDriver");
 			  con = DriverManager.getConnection(url,"scott","tiger");
 			  pst = con.prepareStatement("select * from course where courseid=?");
 			  pst.setInt(1, courseid);
 			  rs = pst.executeQuery();
 			  if(rs.next())
 				  crs = new Course(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
 		  }
 		  catch(Exception ex)
 		  {
 			  ex.printStackTrace();
 		  }
 		  finally
 		  {
 			  try
 			  {
 				  if(rs!=null) rs.close();
 				  if(pst!=null) pst.close();
 				  if(con!=null) con.close();
 			  }
 			  catch(Exception ex)
 			  {
 				  ex.printStackTrace();
 			  }
 		  }
 		  return crs;
 	  }
      public ArrayList<Course> getCourse()
	  {
		 ArrayList<Course> clist = new ArrayList<Course>();
		  Connection con = null;
		  PreparedStatement pst = null;
		  ResultSet rs = null;
		  String url="jdbc:oracle:thin:@localhost:1521:orcl";
		  try
		  {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = DriverManager.getConnection(url,"scott","tiger");
			  pst = con.prepareStatement("select * from course");
			  rs = pst.executeQuery();
			  while(rs.next())
				  clist.add(new Course(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(rs!=null) rs.close();
				  if(pst!=null) pst.close();
				  if(con!=null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
		  return clist;
}
}


    



