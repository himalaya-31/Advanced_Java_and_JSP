<%-- 
    Document   : loggedin
    Created on : 23 Jul, 2017, 10:17:55 PM
    Author     : Puneet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="styless.css">
    </head>
    <body>
      <div class="container">
        <h1 class="text">Welcome ${username}!</h1>
        
            <label style="font-size: 22px; padding-left:20%;">Personal Details : </label>
        <div>        
        <p>Firstname : ${firstname}</p>
        <p>Lastname : ${lastname}</p>
        <p>Date of Birth : ${dob}</p>
        <p>Mobile : ${mobile}</p>
        <p>Email Id : ${email}</p>
        <p>Address : ${address}</p>
        <label style="font-size:22px; padding-left:18%;">Educational Details :</label><br>
        <p>Graduation Course : ${grac}</p>       
        <p>Graduation Year : ${grayr}</p>
        <p>Post-Graduation course : ${postc}</p>
        <p>Post-Graduation year : ${postyr}</p>
        </div>
        <input type="button" class="button" value="Logout" id="submit" onclick="logout();"><br>
      </div>     
               
      
       <script type="text/javascript">
           function logout()
           {
            window.location("index.html");
            alert("you have successfully log out");
           }
      </script> 
    </body>
</html>
