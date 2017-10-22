/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
/**
 *
 * @author Puneet
 */
public class welcome extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        @SuppressWarnings("unused")
		PrintWriter out = response.getWriter();
        String firstname = null;
        String lastname = null;
        String graduationcourse = null;
        String graduationyear = null;
        String postgra = null;
        String postyr = null;
        String address = null;
        String mobile = null;
        String email = null;
        String dob = null;
        String name = request.getParameter("username");
       
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database","root","puneet@049");
            PreparedStatement s = con.prepareStatement("select * from student where username = ?");
            s.setString(1, name);
            ResultSet rs = s.executeQuery();
            if (rs.next()){
                firstname = rs.getString("firstname");
                lastname = rs.getString("lastname");
                graduationcourse = rs.getString("grac");
                graduationyear = rs.getString("grayr");
                postgra = rs.getString("postc");
                postyr = rs.getString("postyr");
                address = rs.getString("address");
                mobile = rs.getString("mobile");
                email = rs.getString("email");
                dob = rs.getString("dob");
            } 
            } 
        catch (Exception se)
        { 
            se.printStackTrace();
        }
      request.setAttribute("username",name);
      request.setAttribute("firstname", firstname);
      request.setAttribute("lastname", lastname);
      request.setAttribute("grac", graduationcourse);
      request.setAttribute("grayr", graduationyear);
      request.setAttribute("postc", postgra);
      request.setAttribute("postyr", postyr);
      request.setAttribute("address", address);
      request.setAttribute("mobile", mobile);
      request.setAttribute("email", email);
      request.setAttribute("dob",dob);
      request.getRequestDispatcher("loggedin.jsp").forward(request,response);
    
    }
        
}

