<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate2">
    <tiles:putAttribute name="body">
        <h1>FAQ</h1>
        <c:forEach items="${faqs}" var="faq">
        <div class="container">
            <div class="jumbotron">
                
                <div><b>Question:</b> ${faq.question}</div>
                <div><b>Ask:</b>${faq.ask}</div>
                  
            </div>
        </c:foreach> 
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>
