$(function() {
	$('#submission').click(function() {
		
		var protocol = window.location.protocol;
		var host = window.location.host;
		
		$.ajax({
			type:"post",
			url:protocol + "//" + host + "/user/login",
			data:{username:$("#firstname").val(),password:$("#lastname").val()},
			success:function(data){
				/*返回的数据不能传到新的页面*/
                alert("成功");
                window.location.href = protocol + "//" + host + "/user/ajax";
            },
            error:function(e) {
                alert("出错："+e);
            }
		});
		
	});
	
	
})