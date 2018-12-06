<%--
  Created by IntelliJ IDEA.
  User: datquocngo
  Date: 05/12/2018
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Currency</title>
</head>
<body>
<h1>Convert Currency</h1>
<form method="post" action="/main">
    RATE: 23000 <br>
    USD: <input type="text" name="usd" id="usd"/><br>

    <button type="submit">Convert</button>
</form>

<h3>VND: ${vnd}</h3>

</body>
</html>