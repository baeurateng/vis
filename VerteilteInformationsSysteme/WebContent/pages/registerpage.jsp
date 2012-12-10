<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="registerpage.title"/></title>
</head>
<body>
	<s:form action="Register" focusElement="firstname">
		<s:textfield name="firstname" key="registerpage.firstname" required="true"></s:textfield>
		<s:textfield name="lastname" key="registerpage.lastname" required="true"></s:textfield>
		<s:textfield name="email" key="registerpage.eMail" required="true"></s:textfield>
		<s:password name="password" key="prompt.password" size="20" required="true" />
		<br>
		<s:submit method="execute" value="register" align="center" />
	</s:form>
</body>
</html>