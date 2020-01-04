<%@page import="com.del.second.entity.Course,com.del.second.dao.CourseDAO" %>
<%
   Course c = (Course)request.getAttribute("crs");
   if(c==null) c = new Course();
 %>
<html>
<body>    
   <form action="CourseCrudServlet">
     <table align=center width=80% bgcolor=lightblue>
        <tr>
          <th>Course Id</th>
          <td><input type=text name=courseid value=<%=c.getCourseid()%>></td>
        </tr>
        <tr>
          <th>Course Name</th>
          <td><input type=text name=coursename value=<%=c.getCoursename()%>></td>
        </tr>
        <tr>
          <th>Course Duration</th>
          <td><input type=text name=courseduration value=<%=c.getCourseduration()%>></td>
        </tr>
        <tr>
          <th>Course Fee</th>
          <td><input type=text name=coursefee value=<%=c.getCoursefee()%>></td>
        </tr>
        <tr>
          <td><input type=submit value=Add_Course name="sub"></td>
          <td><input type=submit value=Show_Course name="sub"></td>
        </tr>
        <tr>
          <td><input type=submit value=Delete_Course name="sub"></td>
          <td><input type=submit value=Modify_Course name="sub"></td>
        </tr>  
  </table>
  </form>
</body>
</html>