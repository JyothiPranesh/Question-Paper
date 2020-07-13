/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class secj extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out=response.getWriter();
       //String n=request.getParameter("ques");
      //HttpSession session=request.getSession();  
        //session.setAttribute("uname",n);  
       if(request.getParameter("ques").equals("Admin"))
      {
          
       
          //out.println("<html><body><center><br/><br/><h1><a href='Admin.jsp'>AdminLogin</a></h1></center></body></html>");
          //out.println("<center><b>WELCOME TOADMIN LOGIN</b><center>");
          out.println("<html><head><link rel='stylesheet' type='text/css' href='login.css'></head>" );
           out.println("<body bgcolor='orange'>");
          out.println("<center><form action='Adminj' method='get' class='form'>");
          out.println("<h1>WELCOME TO ADMIN LOGIN</h1><table><tr>USERNAME<input type='text' name='name' placeholder='USERNAME'></tr><br/><br/>");
          out.println("<tr>PASSWORD<input type='password' name='pass' placeholder='PASSWORD'></tr><br/><br/>");
          out.println("<tr><input type='submit' value='submit'></tr></table><br/>");
          out.println("</form></center></body></html>");
          
          
          
          
      }
      else if(request.getParameter("ques").equals("User"))
      {
           
          out.println("<html><head><link rel='stylesheet' type='text/css' href='login.css'></head><body bgcolor='orange'>");
          out.println("<center><form action='LoginServlet' method='post' class='form'>");
          out.println("<h1>WELCOME TO USER LOGIN</h1><table><tr>username<br/><input type='text' name='username' placeholder='USERNAME'></tr><br/><br/>");
          out.println("<tr>password<br/><input type='password' name='password' placeholder='PASSWORD'></tr><br/><br/>");
          out.println("<tr><input type='submit' value='submit'></tr></table><br/>");
          out.println("</form></center></body></html>");
          
      }
      else
      {
          out.println("<center><b>PLEASE ENTER ANY ONE CHOICE</b><center><br/><br/>");
      }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
