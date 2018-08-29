<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/zhuzhe.js"></script>
<script>
$(function(){
	//日历
    $("#birthday").click(function(){
        WdatePicker({
            highLineWeekDay:true //周末高亮
            ,readOnly:true      //只读，只可用控件input中 修改内容
            ,dateFmt:'yyyy-MM-dd'
        });
    });
});
</script>
</head>
<body>
<form  method="post" action="addquestions" id="form1">
<table border="1" align="center" cellpadding="0" cellspacing="0" width="50%" id="form2">
	<tr>
		<th>图书名称</th>
		<td><input type="text" name="name"  id ="name"></td>
	</tr>
	<tr>
		<th>图书作者</th>
		<td><input type="text" name="zhuozhe"  id ="zhuozhe"></td>
	</tr>
	<tr>
		<th>购买时间</th>
		<td><input type="text" name="birthday"  id ="birthday"></td>
	</tr>
	<tr>
		<th>图书类别</th>
		<td><select name="xiang" id="select">
						    <option value="">请选择</option>
						    <option value="1">计算机/软件</option>
						    <option value="2">小说/文稿</option>
						    <option value="3">杂项</option>
  						</select></td>
	</tr>
	<tr>
		<td colspan="2">
			  <input type="submit" name="button"  value="添加图书" id="tian"/>
		</td>
	</tr>
</table>
</form>
</body>
</html>