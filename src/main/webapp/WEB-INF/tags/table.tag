<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
<c:when test="${requestScope['list'] != null}">
    <table>
        <tr>
            <th>user</th>
            <th>host</th>
        </tr>
        <c:forEach items="${requestScope['list']}" var="user">
            <tr>
                <td><c:out value="${user.getUser()}"/></td>
                <td><c:out value="${user.getHost()}"/></td>
            </tr>
        </c:forEach>
    </table>
</c:when>

</c:choose>


