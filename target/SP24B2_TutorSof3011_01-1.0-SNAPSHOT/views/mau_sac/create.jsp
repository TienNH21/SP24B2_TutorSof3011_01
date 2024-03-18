<%--
  Created by IntelliJ IDEA.
  User: tiennh
  Date: 3/15/24
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/mau-sac/store">
        <div>
            <label>Ma</label>
            <input type="text" name="ma" />
        </div>
        <div>
            <label>Ten</label>
            <input type="text" name="ten" />
        </div>
        <div>
            <label>Trang thai</label>
            <input type="radio" name="trangThai" value="1"/>
            <label>Dang hoat dong</label>
            <input type="radio" name="trangThai" value="0"/>
            <label>Ngung hoat dong</label>
        </div>
        <div>
            <button>Them</button>
        </div>
    </form>
</body>
</html>
