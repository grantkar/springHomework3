<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<form:form action="processForm" modelAttribute="product">
    <br>
    Id product: <form:input path="id" />
    <br>
    Title product: <form:input path="title" />
    <br>
    Cost product: <form:input path="cost" />
    <br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>