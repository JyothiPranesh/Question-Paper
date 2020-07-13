/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class Userj extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    String n=request.getParameter("type");
                    String n1=request.getParameter("sub");
                    String n3=request.getParameter("sem");
                    String n4=request.getParameter("time");
                    String n5=request.getParameter("maxmarks");
                    String n2;
                    HttpSession session=request.getSession();  
                    session.setAttribute("type",n); 
                    
                    session.setAttribute("subject", n1);
                    session.setAttribute("sem", n3);
                    session.setAttribute("time", n4);
                    session.setAttribute("maxmarks", n5);
                    try
                    {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/Project", "root", "root");
                   // Statement st=conn.createStatement();
                    ResultSet rs =null;
                 
                     PreparedStatement st=null;
                     st= conn.prepareStatement("select * from course where name=?");
                      st.setString(1,n1); 
                         rs= st.executeQuery();
                    while(rs.next())
                    { 
                    n2 = rs.getString(2);
                    

                   session.setAttribute("code", n2);
                    }
                    
                    }
                    catch(Exception e)
                    {
                        System.out.print(e);
                        e.printStackTrace();
                    }                   
                    PrintWriter out=response.getWriter();
                    out.println("<html><head><link rel='stylesheet' type='text/css' href='login.css'></head><body bgcolor='Lime'><form class='login' background= '#489ac975'><center><br/><br/><br/><br/>");
                    out.println("<div><h1>Click on choice:</h1><br/><br/>&nbsp;<a href='AddQues.jsp'>Add Questions</a><br/>");
                    out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='DelQues.jsp'>Remove Questions</a><br/>");
                   
                    out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='DisQues.jsp'>Display Questions</a><br/>");
                    out.println("</center></form></body></html>");
               
                
                
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
