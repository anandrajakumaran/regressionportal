<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<html lang="en">

<jsp:include page="../fragments/headTag.jsp"/>

<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>
<%--     <c:choose>
        <c:when test="${owner['new']}"><c:set var="method" value="post"/></c:when>
        <c:otherwise><c:set var="method" value="put"/></c:otherwise>
    </c:choose>

    <h2>
        <c:if test="${owner['new']}">New </c:if> Owner
    </h2> --%>
    <form:form modelAttribute="project" method="post" class="form-horizontal" id="add-project-form">
        <petclinic:inputField label="Submitter" name="submitter"/>
        <petclinic:inputField label="Jira ID" name="jira_id"/>
        <petclinic:inputField label="SME Status" name="sme_status"/>
        <petclinic:inputField label="Regressoin Status" name="regression_status"/>
        <petclinic:inputField label="Automation Link" name="automation_link"/>
         <petclinic:inputField label="Fusion Link" name="fusion_link"/>

        <div class="form-actions">
          <%--   <c:choose>
                <c:when test="${owner['new']}"> --%>
                    <button type="submit">Create Request</button>
<%--                 </c:when>
                <c:otherwise>
                    <button type="submit">Update Owner</button>
                </c:otherwise>
            </c:choose> --%>
        </div>
    </form:form>
</div>
<jsp:include page="../fragments/footer.jsp"/>
</body>

</html>
