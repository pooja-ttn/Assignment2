<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 21/3/19
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answers For All the Questions</title>
</head>
<body>

<b style="margin-top: 100px;">Question 1)<br>
    Implement AbstractController in StudentController. create a mapping index.html for it
     and render index.jsp view from it which displays messages "Hello from index.jsp"

     <center><form action="/index.html"><input type="submit" value="Click For Answer"></form></center>


<b style="margin-top: 50px;">Question 2)<br>
     Now remove AbstractController and use MultiActionController for
    StudentController2 which contains 2 actions one action renders a jsp view and
    another action uses HttpServletResponse to show the output on the Web browser.</b>
<center><form action="/test"><input type="submit" value="Click For Answer"></form></center>


<b style="margin-top: 50px;">Question 3)<br>
    Use annotation in StudentController to define a default action index which renders a jsp page.*/
</b>
<center><form action="/test2"><input type="submit" value="Click For Answer"></form></center>


<div style="margin-top: 20px;font-weight: bold;">Question 4) to 8)<br>
Pass values directly in the URL .

</div><BR>
<b style="margin-top: 20px;">Question 9) and Question 10)-<br></b>

<b style="margin-top: 10px;">
    Q9)Create a StudentCO and bind firstname and lastname with instance variable of StudentCO.<br>
    Q 10)Use @ModelAttribute annotation to add Heading "Spring MVC Demo" in every model.
    <br></b>
<center><form action="/test1"><input type="submit" value="Click For Answer"></form></center>
</body>
</html>
