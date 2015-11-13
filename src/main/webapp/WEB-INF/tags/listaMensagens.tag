<%@ tag language="java" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ attribute name="chave" required="true" %>
<%@ attribute name="messageList" type="java.util.List" required="true" %>

<fmt:message key="${chave}"/>

<br/><br/>

<c:forEach items="${messageList}" var="VO">
	<fmt:message key="${VO.mensagem}"/>
		
	<c:if test="${VO.linkExiste}">
		<fmt:message key="${VO.link}" var="link"/>
		<c:url value="${link}"/>
	</c:if>
	
	<br/>
</c:forEach>