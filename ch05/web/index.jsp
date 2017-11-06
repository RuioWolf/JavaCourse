<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/6
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
<head>
    <title>添加商品信息</title>
</head>
<body>
<center>
    <h2>添加新商品信息</h2>
    <form action="pre_insert.jsp" method="post">
        <p>商品编号：<input type="text" name="p_id"></p>
        <p>商品类别：<input type="text" name="p_type"></p>
        <p>商品名称：<input type="text" name="p_name"></p>
        <p>商品价格：<input type="text" name="p_price"></p>
        <p>商品数量：<input type="text" name="p_quantity"></p>
        <p>商品路径：<input type="text" name="p_image"></p>
        <p>商品描述：<input type="text" name="p_description"></p>
        <input type="submit" value="添加">
        <input type="reset" value="重置">
    </form>
</center>
</body>
</html>
