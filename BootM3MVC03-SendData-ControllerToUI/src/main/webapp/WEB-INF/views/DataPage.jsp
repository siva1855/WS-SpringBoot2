<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h2>welcome to primitive Data!!!!!</h2>
	${id },${name},${fee}
	<hr />

	<h2>welcome to Object Data!!!!!</h2>
	${empUI}
	<br /> ${empUI.employeeId },${empUI.employeeName },${empUI.employeeDesignation }
	<hr />

	<h2>welcome to Collection(list) Data!!!!!</h2>
	${listUI }
	<br /> ${listUI[0] }

	<h3>read forEach Data</h3>
	<c:forEach items="${listUI}" var="objList">
		<c:out value="${objList }" />
		<br />
	</c:forEach>
	<hr />

	<h2>welcome to Collection(map) Data!!!!!</h2>
	${mapUI }
	<h3>read forEach Data</h3>
	<c:forEach items="${mapUI}" var="objMap">
		<c:out value="${objMap.key }-${objMap.value }" />
		<br />
	</c:forEach>
	<hr />
</body>
</html>