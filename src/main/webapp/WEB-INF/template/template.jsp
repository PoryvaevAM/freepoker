<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
        
        <!--script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script-->
        <!--script src="../../Resource/js/validate.js" type="text/javascript"></script-->
        <script src="../../Resource/js/jquery-2.1.3.min.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />
        <link href="../../Resource/js/newcss.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="menu" />
        <tiles:insertAttribute name="body" />
        <tiles:insertAttribute name="footer" />
    </body>
</html>