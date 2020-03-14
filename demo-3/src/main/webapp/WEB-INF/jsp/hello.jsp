<%@ page pageEncoding="UTF-8" language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="https://cdn.jsdelivr.net/npm/vue"></script>
	<script>
	var app = new Vue({
		  el: '#app',
		  data: {
		    message: '안녕하세요 Vue!'
		  }
		});
	</script>
</head>
<body>
	<div id="app">
  	{{ message }}
	</div>
</body>
</html>