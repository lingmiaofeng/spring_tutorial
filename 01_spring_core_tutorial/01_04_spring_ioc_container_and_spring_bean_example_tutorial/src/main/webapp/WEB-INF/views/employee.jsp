<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


<P>MyBean hashcode= ${ myBean.hash }</P>
<P>MyAnnotatedBean hashcode = ${myAnnotatedBean.hash } </P>

<P>The time on the server is ${serverTime}. </P>


</body>
</html>
