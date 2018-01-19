<%@ page contentType="text/html;charset=UTF-8" %>
<%--每秒自动刷新--%>
<%--<head>--%>
<%--<meta http-equiv="refresh" content="1">--%>
<%--</head>--%>
<%
    // java虚拟机 能取得的最大内存
    long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
    // java虚拟机 当前取得的内存大小
    long totalMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
    // java虚拟机 所占用的内存中的空闲部分
    long freeMemory = Runtime.getRuntime().freeMemory() / 1024 / 1024;
    // java虚拟机当前实际使用的内存大小
    long usedMemory = totalMemory - freeMemory;

//    out.println("Dankal SFTC Web Server Monitor<br>");
//    out.println("<br>Server Status : StillWorking");
//    out.println("<br>Max   Momery is : " + maxMemory + "M");
//    out.println("<br>Total Memory is : " + totalMemory + "M");
//    out.println("<br>Used  Memory is : " + usedMemory + "M");
//    out.println("<br>Free  Memory is : " + freeMemory + "M");
//    out.println("<br>Memory Status : " + (usedMemory < maxMemory ?
//            "<a style='color:green;'>LessOfMemory ✅</a>" :
//            "<a style='color:red;'>OutOfMemory ❌</a>")
//    );
//    out.println("<br>DateTime : " + new java.util.Date());
%>
