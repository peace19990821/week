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
<h1>详情页面</h1>
<fm:form action="" method="post" modelAttribute="goods">
		<fm:hidden path="gid"/>
	商品名称:<fm:input path="gname"/><br><br>
	价格:<fm:input path="price"/><br><br>
	发布时间:<fm:input path="datea"/><br><br>
	品牌:<fm:select path="bid">
			<fm:option value="${goods.bid}">
				<c:if test="${goods.bid==1}">
					耐克
				</c:if>
				<c:if test="${goods.bid==2}">
					匹克
				</c:if>
				<c:if test="${goods.bid==3}">
					卡帕
				</c:if>
			</fm:option>
		</fm:select><br><br>
	分类:<fm:select path="tid">
			<fm:option value="${goods.tid}">
				<c:if test="${goods.tid==1}">
					鞋
				</c:if>
				<c:if test="${goods.tid==2}">
					衣服
				</c:if>
				<c:if test="${goods.tid==3}">
					衬衫
				</c:if>
				<c:if test="${goods.tid==4}">
					卫衣
				</c:if>
			</fm:option>
		</fm:select>
</fm:form>
</body>
</html>