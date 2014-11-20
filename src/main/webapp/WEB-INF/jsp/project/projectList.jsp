<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>

<html lang="en">


<jsp:include page="../fragments/headTag.jsp"/>

<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>

    <h2>Regression Requests</h2>

    <datatables:table id="vets" data="${project}" row="project" theme="jqueryui"
     cssClass="table table-striped " pageable="true" autoWidth="true" export="pdf" displayLength="2">

        <datatables:column title="Name" >
            <c:out value="${project.submitter}"></c:out>
        </datatables:column>
           <datatables:column title="Submitter" >
            <c:out value="${project.jira_id}"></c:out>
        </datatables:column>
           <datatables:column title="Jira Id" >
            <c:out value="${project.sme_status}"></c:out>
        </datatables:column>
           <datatables:column title="SME Status" >
            <c:out value="${project.regression_status}"></c:out>
        </datatables:column>
         <datatables:column title="Automation Link" >
         	<a href="${project.automation_link}"> Automation </a>
        </datatables:column>
        <datatables:column title="Fusion Link" >
        	<a href="${project.fusion_link}"> Fusion Job link </a>
        </datatables:column>
    </datatables:table>
    
<%--     <table class="table-buttons">
        <tr>
            <td>
                <a href="<spring:url value="/vets.xml" htmlEscape="true" />">View as XML</a>
            </td>
            <td>
                <a href="<spring:url value="/vets.atom" htmlEscape="true" />">Subscribe to Atom feed</a>
            </td>
        </tr>
    </table> --%>

    <jsp:include page="../fragments/footer.jsp"/>
</div>
</body>

</html>
