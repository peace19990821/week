<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<link href="/css/css.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<fm:form action="update" method="post" modelAttribute="goods">
		<fm:hidden path="gid"/>
	商品名称:<fm:input path="gname"/><br><br>
	价格:<fm:input path="price"/><br><br>
	发布时间:<fm:input path="datea"/><br><br>
	品牌:<select name="bid">
			<c:forEach items="${brands}" var="b">
				<option value="${b.bid}">${b.bname}</option>
			</c:forEach>
		</select><br><br>
	分类:<select name="tid">
			<c:forEach items="${types}" var="t">
				<option value="${t.tid}">${t.tname}</option>
			</c:forEach>
		</select><br><br>
		<fm:button>保存</fm:button>
</fm:form>
</body>
<script type="text/javascript">
$.post("toAdd",function(back){
	for ( var i in back) {
		$("tid").append("<option value='"+${t.tid}+"'>'"+${t.tname}+"'</option>");
	}
},"json")
</script>
</html>