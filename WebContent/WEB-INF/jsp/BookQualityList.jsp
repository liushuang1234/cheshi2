<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script>

$(function(){
	$("tr:even").css("background-color","#ccc");
	$("tr:eq(0)").css("background-color","#ccc");
	

});
function delUser(b_id,obj){
    if(confirm("确定要删除吗？")==true){
    	 $.ajax({
    			url:"delete",
    			type:"get",
    			data:{"mid":b_id},
    			dataType:"json",
    			success:function(data){
    				$(obj).parent().parent().remove();//删除行
    			}
    		});
    }else {
    	return;
    }
}
</script>
</head>
<body>
<h2 style="width:250px; margin: 0 auto;" >图书信息系统</h2>
<table border="1" align="center" cellpadding="0" cellspacing="0" width="50%">
<tr>
	<th>图书名称</th>
	<th>图书作者</th>
	<th>购买时间</th>
	<th>图书分类</th>
	<th>操作</th>
</tr>
<c:forEach items="${list }" var="u">
<tr>
	<td>${u.b_name }</td>
	<td>${u.b_author }</td>
	<td>${u.b_time }</td>
	<td>${u.b_type==1?"计算机/软件":(u.b_type==2?"小说/文稿":"杂项") }</td>
	<td><a href='javaScript:void(0)' onclick="delUser(${u.b_id },this)">删除</a></td>
</tr>
</c:forEach>
</table>
<p align="center">
	<a href="toadduser" >添加监测信息</a>
</p>
</body>
</html>