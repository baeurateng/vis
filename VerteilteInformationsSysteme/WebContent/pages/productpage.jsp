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
	<s:form action="AddProduct">
		<s:text name="prompt.addproduct"/>
		<s:textfield name="productname" key="prompt.productname"/>
		<s:textfield name="productdescription" key="prompt.productdescription"/>
		<s:textfield name="productprice" key="prompt.productprice"/>
		<s:select list="categories"/>
		<s:submit action="execute" value="Add Product" align="left"></s:submit>
	</s:form>
</body>
</html>