<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> <s:text name="productpage.title"></s:text> </title>
</head>
<body>
	<s:form action="AddProduct" focusElement="productname">
		<s:text name="prompt.addproduct"/>
		<s:textfield name="productname" key="prompt.productname" required="true"/>
		<s:textfield name="productdescription" key="prompt.productdescription" required="true"/>
		<s:textfield name="productprice" key="prompt.productprice" required="true"/>
		<s:select list="categories" headerKey="-1" name="categoriename" listKey="name" listValue="name"/>
		<s:submit method="execute" value="add" align="left" />
	</s:form>
	
	<table border="0" cellspacing="0" cellpadding="1">
		<tr>
			<th>Produkte:</th>
		</tr>
		<s:iterator value="products">
			<tr>
				<s:form action="DeleteProduct">
					<s:textfield name="name" readonly="true"></s:textfield>
					<s:submit method="execute" value="delete" align="left" />
				</s:form>
			</tr>
		</s:iterator>
	</table>
</body>
</html>