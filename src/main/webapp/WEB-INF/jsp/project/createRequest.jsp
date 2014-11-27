<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>


<html lang="en">

<jsp:include page="../fragments/headTag.jsp"/>

<script>
$(document).ready(function() {
    toggleFields(); //call this first so we start out with the correct visibility depending on the selected form values
   //this will call our toggleFields function every time the selection value of our underAge field changes
    $("#automation_required").change(function() { toggleFields(); });
    
/*     $("#automation_status").change(function() { toggleLink(); }); */

});

    $(function () {
        $("#release_date").datepicker({ dateFormat: 'yy/mm/dd'});
    });
    
    function toggleFields(){
    	$('#automation_required').change(function() {
    		 if ($(this).val() === 'No') {
    			 $('#automation_status').hide();
    			 
    			 }else{
    				 $('#automation_status').show();
    			 }
    	})
    }
    
   /*  function toggleLink(){
    	$('#automation_status').change(function() {
    		 if ($(this).val() === 'C') {
    			 $('#automation_link').show();
    			 }else{
    				 $('#automation_link').hide();
    			 }
    	})
    } */
</script>



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
    
        <petclinic:inputField label="Component" name="component"/>
        <petclinic:inputField label="Jira ID" name="jira_id"/>
        
            <c:set var="cssGroup" value="control-group ${status.error ? 'error' : '' }"/>
		    <div class="${cssGroup}">
		        <label class="control-label">Release description</label>
		
		        <div class="controls">
		           <textarea rows="4" cols="50" name="release_description"></textarea>
		        </div>
		    </div>
         
        <petclinic:inputField label="Release Date" name="release_date"/>
        
        <label class="control-label">E2E Required</label>

        <div class="controls">
            <select id="automation_required" name="automation_required">
			   <option value="Yes">Yes</option>
			   <option value="No">No</option>
			</select>
        </div>
        
    	<br>
    	<div id="automation_status">
    	 	        <label class="control-label">Automation Status</label>

        <div class="controls">
            <select id="automation_status" name="automation_status">
			   <option value="N">Not Started</option>
			   <option value="P">Pending</option>
			   <option value="C">Complete</option>
			</select>
        </div>
        
    	 <br>
    	 
    	 <petclinic:inputField label="Automation Link" name="automation_link"/>
    	 </div> 
<%--         <petclinic:inputField label="SME Status" name="sme_status"/>
        <petclinic:inputField label="Regressoin Status" name="regression_status"/> --%>
        
        
<%--          <petclinic:inputField label="Fusion Link" name="fusion_link"/>
			<petclinic:inputField label="Release " name="release_date"/> --%>

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
