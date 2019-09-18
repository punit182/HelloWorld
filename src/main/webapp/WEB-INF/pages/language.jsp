<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:choose>
    <c:when test="${!empty speakingLanguage }">
    <c:forEach var="lang" items="${speakingLanguage}">
    <b>${lang}</b><br>
    </c:forEach>
    </c:when>
    <c:otherwise>
    <b>No Data Found</b>
    </c:otherwise>
    </c:choose>
    <br>
    <a href="home.htm">Home</a>