<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="webshoppage.title" /></title>
</head>
<body>
	<s:form action="Search" focusElement="username">
		<s:textfield name="product" key="prompt.product" size="20"
			required="false" />
		<s:textfield name="categorie" key="prompt.categorie" size="20"
			required="false" />
		<br>

		<s:submit method="execute" value="search" align="center" />
	</s:form>
</body>
</html>