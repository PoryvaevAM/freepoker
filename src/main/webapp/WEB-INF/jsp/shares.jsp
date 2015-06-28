<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate2">
    <tiles:putAttribute name="body">
        <h1>Shares</h1>
        <c:forEach items="${shares}" var="shar">
        <div class="container">
            <div class="jumbotron">
                
                <div><b>Title:</b> ${shar.title}</div>
                <div><b>Description:</b>${shar.text}</div>
                  
            </div>
        </c:foreach> 
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>