<%-- 
    Document   : sec.jsp
    Created on : May 11, 2020, 9:33:43 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question Paper</title>
        <style>
                       @import url(https://fonts.googleapis.com/css?family=Roboto:300);
.body{
}

.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
  
}
.form {
  position: relative;
  z-index: 1;
  background: #489ac975;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  
}

.form button {
  font-family: "Rose", sans-serif;
  font-size: 14px;
  font-weight: bold;
  letter-spacing: .1em;
  outline: 0;
  background-color: #1784a5;
  width: 100%;
  border: 0;
  margin: 0px 0px 8px;
  padding: 15px;
  color:"Rose";
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;


}
.form button:hover,.form button:active,.form button:focus {
  background-color: #148f77;
}


.form .message {
  
  margin: 6px 6px;
  color: #808080;
  font-size: 11px;
  text-align: center;
  font-weight: bold;
  font-style: normal;

  

}
.form .message a {
  color: #FFFFFF;
  text-decoration: none;
  font-size: 13px;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
body {
  background: #76b852; /* fallback for old browsers */
  background: -webkit-linear-gradient(right, #76b852, #8DC26F);
  background: -moz-linear-gradient(right, #76b852, #8DC26F);
  background: -o-linear-gradient(right, #76b852, #8DC26F);
  background: linear-gradient(to left, #8dc26f, #148f77);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}
  
          
        </style>
    </head>
    <body bgcolor="Gold">
       
        <form action="secj" method="get" class="form">
            <center>
             <br/>
             <h1>Select One Choice</h1>
             <br/><br/>
            
             <input type="radio" value="Admin" name="ques">ADMIN<br/><br/>
               <input type="radio" value="User" name="ques">USER<br/><br/>
                 <input type="submit" value="submit"/>
            </center>
        </form>
      
        
    </body>
</html>
