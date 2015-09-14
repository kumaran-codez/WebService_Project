<%-- 
    Document   : index
    Created on : Apr 14, 2013, 4:43:31 PM
    Author     : kumaranramanujam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ITM566_MP3_ASSIGNMENT</title>
          <style type="text/css">
		
                h1 {text-align:center; font-family: cursive; color: blue;}
                h2 {text-align:left; font-family: cursive; color: blue;}
                h3 {text-align:left; font-family: cursive; color: blue; 
                        text-decoration:underline;}
                body {background-color: lightgrey;}
                #footer {text-align:center;background-color: grey;}
                #header {text-align: center; background-color: grey;
                         border-color:black; border-spacing: 10px;}
                #content-wrapper{background-color: white;}
           </style>
    </head>
    <body>
        <div id="header">
        <h1> ITM566 | ASSIGNMENT - 3 | Part -1 </h1>
        </div>    
        <div id="content-wrapper">
        <h2> Choose the Web operation : </h2> 
        <br>
        <h3> 1. Addition of Matrices </h3> 
        <br>
        <form name="add" action="ClientServlet">&nbsp;
            <input type="submit" value="add" name="Operation" />
        </form>
        <br>
        <h3> 2. Subtraction of Matrices </h3>
        <br>
        <form name="subtract" action="ClientServlet">&nbsp;
            <input type="submit" value="subtract" name="Operation" />
        </form>
        <br>
        <h3> 3. Multiplication of Matrices </h3>
        <br>
        <form name="multiply" action="ClientServlet">&nbsp;
            <input type="submit" value="multiply" name="Operation" />
        </form>
        <br>
        <h3> 4. Array Left Divide of Matrices </h3>
        <br>
        <form name="divideL" action="ClientServlet">&nbsp;
            <input type="submit" value="divideL" name="Operation" />
        </form>
        <br>
        <h3> 5. Array Right Divide of Matrices </h3>
        <br>
        <form name="divideR" action="ClientServlet">&nbsp;
            <input type="submit" value="divideR" name="Operation" />
        </form>
        </div>
       
        <div id="footer">
            	<br/>
                <p>Copyright &copy; 2013 Kumaran Ramanujam</p>
        </div>
    </body>
</html>
