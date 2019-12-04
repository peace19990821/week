<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<link href="/css/css.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<a href="toAdd"> <input type="button" value="新增"> </a>
	<input type="button" value="批删" onclick="delMore()">
<table>
  <tr>
    <td>
    	<form action="selList" method="post">
    		<input type="text" name="gname">
    		<input type="submit" value="查询">
    	</form>
    </td>
  </tr>
</table>
<table>
  <tr>
    <th>
    	<input type="checkbox" onclick="selAll(this.checked)">
    </th> 
    <th>编号</th>
    <th>商品名称</th>
    <th>品牌</th>
    <th>分类</th>
    <th>价格</th>
    <th>发布时间</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${pg.list}" var="goods">
  <tr>
    <td>
    	<input type="checkbox" value="${goods.gid}" class="ck">
    </td>
    <td>${goods.gid}</td>
    <td>${goods.gname}</td>
    <td>${goods.bname}</td>
    <td>${goods.tname}</td>
    <td>${goods.price}</td>
    <td>${goods.datea}</td>
    <td>
    	<a href="look?gid=${goods.gid}" target="look"> <input type="button" value="详情"> </a>
    	<a href="toUpdate?gid=${goods.gid}"> <input type="button" value="编辑"> </a>
    </td>
  </tr>
  </c:forEach>
</table>
<table>
  <tr>
    <td>
    <form action="selList" method="post">
    	<button name="pageNum" value="1">首页</button>
    	<button name="pageNum" value="${pg.nextPage==0?1:pg.prePage}">上一页</button>
    	当前${pg.pageNum}页/共${pg.pages}页
    	<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage}">下一页</button>
    	<button name="pageNum" value="${pg.pages}">末页</button>
    </form>
    </td>
  </tr>
</table>
</body>
<script type="text/javascript">
	// 全选
	function selAll(flag){
		$(".ck").attr("checked",flag);
	}
	
	// 批删
	function delMore() {
		var gids = [];
		$(".ck:checked").each(function () {
			gids.push($(this).val());
		});
		if(gids.length > 0){
			if(confirm("确认要删除吗?")){
				alert("删除成功");
				location.href="delMore?gids="+gids;
			}
		}else{
			alert("请至少选择一条数据!");
		}
	}
</script>
</html>