<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<tiles:insertDefinition name="defaultTemplate2">
    <tiles:putAttribute name="body">
        <h1>FAQ</h1>
        <c:forEach items="${faqs}" var="faq">
        <div class="container">
            <div class="jumbotron">
                
                <div><b>Question: </b><span>${faq.question}</span></div>
                <div><b>Ask: </b><span>${faq.ask}</span></div>
                  
            </div>
        </div>        
        </c:forEach> 
        
    </tiles:putAttribute>
</tiles:insertDefinition>
