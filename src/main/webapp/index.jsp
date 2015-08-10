<%@page import="cn.net.vive.demo.Test" %>
<%
    Test test = new Test();
    String msg = test.getMsg("wjh");
    pageContext.setAttribute("msg",msg);
%>


<html>
<body>
<h2>Hello World!2</h2>
<h2>${msg}</h2>
</body>
</html>
