/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.pink;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class Adminj extends HttpServlet {

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                 PrintWriter out=response.getWriter();
                 
                  
       		String uname = request.getParameter("name");
		String pass = request.getParameter("pass");
                String username =getServletContext().getInitParameter("username");
		String password =getServletContext().getInitParameter("password");
                if(uname.equals(username) && pass.equals(password))
                {
                    
                            
                    out.println("<html><head><link rel='stylesheet' type='text/css' href='login.css'></head><body bgcolor='pink'><center><br/><br/><form class='login'><table>");
                    out.println("<br/><br/><h1>SELECT ONE OPTION</h1><br/><br/>");
                            
                    out.println("<tr><a href='AddTech.jsp'>Add Techers</a></tr><br/>");
                   out.println("<tr><a href='DelTech.jsp'>Remove Techers</a></tr><br/>");
                    out.println("<tr><a href='AddSub.jsp'>Assign Subjects</a></tr><br/>");
                    out.println("<tr><a href='AddCourse.jsp'>Add Courses</a></tr><br/>");
                  
                    out.println("<tr><a href='DelSub.jsp'>Remove Subjects</a></tr>");
                    
                    out.println("</table></center><form></body></html>");
                }
                else
                {
                    out.println("Cannot login");
                }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
