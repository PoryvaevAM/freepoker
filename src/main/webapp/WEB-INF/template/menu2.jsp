<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-inverse">
    <div class="container">

        <ul class="nav navbar-nav">
            
            <li><a href="<c:url value="/user/show" />">Profile</a></li>
            <li><a href="<c:url value="/user/logout" />">Logout</a></li>
            <li><a href="<c:url value="/content/news" />">News</a></li>
            <li><a href="<c:url value="/content/shares" />">Shares</a></li>
            <li><a href="<c:url value="/content/pokerrooms" />">Poker rooms</a></li>
            <li><a href="<c:url value="/content/faq" />">FAQ</a></li>
            
        </ul>
    </div>
</nav>
