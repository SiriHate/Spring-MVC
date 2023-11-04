<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h2>Dear Employee, you are WELCOME!!!</h2>

<br>
<br>
<br>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Your phone: ${employee.phoneNumber}
<br>
Your email: ${employee.email}
<br>
Languages(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
    <li> ${lang} </li>
    </c:forEach>
</ul>
</body>
</html>
