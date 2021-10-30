<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>Hello world!</h1>

 <table>
        <thead>
            <tr>
                <th>영화이름</th>
                <th>감독</th>
                <th>장르</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${movieList}" var="movie">
                <tr>
                    <td>${movie.getMovieName()}</td>
                    <td>${movie.getDirector()}</td>
                    <td>${movie.getTypes()}</td>
                </tr>
            </c:forEach>
        </tbody>
        
    </table>
 
</body>
</html>
