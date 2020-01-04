package com.del.second.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.second.dao.CourseDAO;
import com.del.second.entity.Course;
@WebServlet("/CourseCrudServlet")
public class CourseCrudServlet extends HttpServlet
{
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String submit = request.getParameter("sub");
			CourseDAO cdao =new CourseDAO();
			Course c = new Course();
			String message="Successfully ";
			c.setCourseid(Integer.parseInt(request.getParameter("courseid")));
			RequestDispatcher rd = request.getRequestDispatcher("CourseCrud.jsp");
			if(submit.equals("Add_Course") || submit.equals("Modify_Course"))
			{
				c.setCoursename(request.getParameter("coursename"));
				c.setCourseduration(Integer.parseInt(request.getParameter("courseduration")));
				c.setCoursefee(Double.parseDouble(request.getParameter("coursefee")));
				if(submit.equals("Add_Course"))
				{
					cdao.insertCourse(c);
					message=message+"Inserted Record";
				}
				else
				{
					cdao.modifyCourse(c);
					message=message+"Modified Record";
				}
			}
			else if(submit.equals("Delete_Course"))
			{
				if(cdao.removeCourse(c.getCourseid()))
					message="Record Deleted"+message;
				else
					message="Deletion Failed";
			}
			else if(submit.equals("Show_Course"))
			{
				c = cdao.getCourse(c.getCourseid());
				request.setAttribute("crs", c);
			}
	     out.print("<h1><center>"+message+"</center></h1>");
	     rd.include(request,response);
	}
	}

