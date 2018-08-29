
function checkUsercode(){
	if($("#name").val() == ""){
		alert("图书名称不能为空");
		return false;
	}else{
		return true;
	}
}
	function checkzhuozhe(){
	if($("#zhuozhe").val() == ""){
		alert("作者名称不能为空");
		return false;
	}else{
		return true;
	}
}
	function checkselect(){
	if($("#select").val() == ""){
		alert("图书类别不能为空");
		return false;
	}else{
		return true;
	}
	
}

$(function(){
	//登录名验证
	$("#name").blur(function(){
		checkUsercode();
	});
	$("#zhuozhe").blur(function(){
		checkzhuozhe();
	});
	$("#select").blur(function(){
		checkselect();
	});
	//表示是否能提交的验证
});
$(function(){
	//表示是否能提交的验证
	$("#form1").submit(function(){
		if(checkUsercode()&&checkselect()&&checkzhuozhe()){
			alert("添加成功");
			return true;
		} else {
			alert("信息不完整");
			return false;
		}
	});
});