<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="resultpage.title" /></title>
</head>
<body>
	<table border="0" cellspacing="0" cellpadding="1">
		<tr>
			<th>Products:</th>
		</tr>
		<s:iterator value="products">
			<tr>
				<s:form action="Detail">
					<s:textfield name="name" readonly="true"></s:textfield>
					<s:submit method="execute" value="detail" align="left" />
				</s:form>
			</tr>
		</s:iterator>
	</table>
</body>
</html>