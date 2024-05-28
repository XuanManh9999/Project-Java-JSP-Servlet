<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: My-PC
  Date: 5/27/2024
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang chủ</title>
</head>
<body>
    <%
        ArrayList<String> list = (ArrayList<String>) request.getAttribute("list");
        // Nếu list không null và có phần tử
        if (list != null && list.size() > 0) {
            for (String item : list) {
                out.print(item + "<br>");
            }
        } else {
            out.print("Không có dữ liệu");
        }
    %>
</body>
</html>
