<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="detailpage.title" /></title>
</head>
<body>
	<s:text name="prompt.productname" />
	<s:property value="product.name"/>
	<br>
	<s:text name="prompt.productdescription" />
	<s:property value="product.description"/>
	<br>
	<s:text name="prompt.productprice" />
	<s:property value="product.price"/>
	<br>
	<s:text name="prompt.categorie" />
	<s:property value="product.categorie.name"/>
</body>
</html>