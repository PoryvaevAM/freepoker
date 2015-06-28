<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate2">
    <tiles:putAttribute name="body">
        <p>${query}</p>
        <div class="container">
            <div class="jumbotron">
                <h1>${current.login}'s Profile</h1>
                <div>Login: ${current.login}</div>
                <div>Password: ${current.password}</div>
                <div>Email: ${current.email}</div>
                <div>Full Name: ${current.fullname}</div>    
            </div>
            
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>