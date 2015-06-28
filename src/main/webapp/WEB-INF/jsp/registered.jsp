<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <div class="container">
            <div class="jumbotron">
                
                <h1 id="hh">Your registration successfully completed, ${query}!</h1>
               
            </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>
