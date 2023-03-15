package dao;
package ads;
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>List of Ads</title>
</head>
<body>
<h1>Ads</h1>

<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Description</th>

    </tr>
    </thead>
    <tbody>

    <ul> <c:forEach items="${ads}" var="ad">
        <li>   <h2>${ad.title} </h2>
            <p>  ${ad.description}</p>
        </li>
    </ul>



    </c:forEach>


</body>
</html>