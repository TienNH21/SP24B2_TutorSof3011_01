<%--
  Created by IntelliJ IDEA.
  User: tiennh
  Date: 3/15/24
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="#">Create</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Ma</th>
        <th>Ten</th>
        <th>TrangThai</th>
        <th colspan="2">Thao tac</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="ms">
        <tr>
            <td>${ms.id}</td>
            <td>${ms.ma}</td>
            <td>${ms.ten}</td>
            <td>${ms.trangThai}</td>
            <td>
                <a href="/mau-sac/edit?id=${ms.id}">Update</a>
            </td>
            <td>
                <a href="/mau-sac/delete?id=${ms.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
