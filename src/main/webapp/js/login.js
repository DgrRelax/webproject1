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
                /*返回的是一个json数据的对象*/
                var u = JSON.stringify(data);
                alert(u);
                
                /*取单个值*/
                alert(data.id);
                alert(data.datatime);
                alert(data.out_id);
                
                /*ajax 异步验证 不能传参数到 新的页面，所以在controller 层使用 session */
                window.location.href = protocol + "//" + host + "/user/ajax";
                
                /*厦航使用template.js 模板，查询一个结果就展示一个结果，不用什么东西都往session里存*/
            },
            error:function(e) {
                alert("出错："+e);
            }
		});
		
	});
	
	
})