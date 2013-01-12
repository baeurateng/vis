<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="categoriepage.title" /></title>
</head>
<body>
	<s:form action="AddCategorie" focusElement="name">
		<s:textfield name="name" key="prompt.categoriename" size="20"
			required="true" />
		<s:textfield name="description" key="prompt.categoriedescription"
			size="20" required="true" />
		<s:submit method="execute" value="add" align="left" />
	</s:form>

	<table border="0" cellspacing="0" cellpadding="1">
		<tr>
			<th>Kategorien:</th>
		</tr>
		<s:iterator value="categories">
			<tr>
				<s:form action="DeleteCategorie">
					<s:textfield name="name" readonly="true"></s:textfield>
					<s:submit method="execute" value="delete" align="left" />
				</s:form>
			</tr>
		</s:iterator>
	</table>
</body>
</html>