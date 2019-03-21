<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 21/3/19
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form page</title>
</head>
<body>

<center>${heading}
    <div style="margin-top: 20px;">
        <form action="/method7">
            <div>First Name<input style="margin-top: 20px;" type="text" name="firstname"/></div>
            <div> LastName<input style="margin-top: 20px;" type="text" name="lastname"/></div>
            <div><input style="margin-top: 20px;" type="submit" value="Submit"></div>

        </form>
    </div>
</center>
</body>
</html>
