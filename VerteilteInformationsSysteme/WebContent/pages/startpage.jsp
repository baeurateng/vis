<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Startseite</title>
</head>
<body>
	<s:form action="Userlogin" focusElement="username" >
		<s:textfield name="username (eMail)" key="prompt.mail" size="20" required="true"/>
		<s:password name="password" key="prompt.password" size="20" required="true"/><br>
		
		<s:submit method="execute" value="login" align="center"/>
		<s:submit method="register" value="register" align="center"/>
	</s:form>
</body>
</html>