<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br>
<br>
<form:form action = "showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname<form:input path="surName"/>
    <form:errors path="surName"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>

    Department <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Hyman Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>

    <form:options items="${employee.departments}"/></form:select>
    <br><br>
    Which Car do you want?
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>

    Foreign Language(s)
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutsch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>

    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>




    <input type="submit" value="OK">

</form:form>




</body>

</html>
