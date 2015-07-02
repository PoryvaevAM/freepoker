<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
        
        <script src="http://www.okna-dom.net/temp/jquery-2.1.3.min.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />
        <script src="http://www.okna-dom.net/temp/validate.js" type="text/javascript"></script>
        
    </head>

    <body>
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="menu2" />
        <tiles:insertAttribute name="body" />
        <tiles:insertAttribute name="footer" />
    </body>
</html>
