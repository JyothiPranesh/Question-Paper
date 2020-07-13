/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class LoginServlet extends HttpServlet {

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        String un=request.getParameter("username");
		String pw=request.getParameter("password");
		HttpSession session=request.getSession();
                session.setAttribute("name",un);
		// Connect to mysql and verify username password
		
                //session.setAttribute("name",un)
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/user", "root", "root"); // gets a new connection
 
		PreparedStatement ps = (PreparedStatement) c.prepareStatement("select username,password from login where username=? and password=?");
		ps.setString(1, un);
		ps.setString(2, pw);
 
		ResultSet rs = ps.executeQuery();
 
		while (rs.next()) {
			response.sendRedirect("sucess_2.jsp");
			return;
		}
		response.sendRedirect("error.html");
		return;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                
		}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
