<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h2>welcome to primitive Data!!!!!</h2>
	${id },${name},${course}
	<hr />

	<h2>welcome to Object Data!!!!!</h2>
	${studentData}
	<br /> ${studentData.id },${studentData.name },${studentData.course }
	<hr />

	<h2>welcome to Collection(list) Data!!!!!</h2>
	 ${listData }<br />
	 ${listData[0] }
	
	<h3>read forEach Data</h3>
	<c:forEach items="${listData}" var="objList">
		<c:out value="${objList }" />
		<br />
	</c:forEach>
	<hr/>
	
	<h2>welcome to Collection(map) Data!!!!!</h2>
	 ${mapData }
	<h3>read forEach Data</h3>
	<c:forEach items="${mapData}" var="objMap">
		<c:out value="${objMap.key }-${objMap.value }" />
		<br />
	</c:forEach>
	<hr />
</body>
</html>