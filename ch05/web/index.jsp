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
    <title>�����Ʒ��Ϣ</title>
</head>
<body>
<center>
    <h2>�������Ʒ��Ϣ</h2>
    <form action="pre_insert.jsp" method="post">
        <p>��Ʒ��ţ�<input type="text" name="p_id"></p>
        <p>��Ʒ���<input type="text" name="p_type"></p>
        <p>��Ʒ���ƣ�<input type="text" name="p_name"></p>
        <p>��Ʒ�۸�<input type="text" name="p_price"></p>
        <p>��Ʒ������<input type="text" name="p_quantity"></p>
        <p>��Ʒ·����<input type="text" name="p_image"></p>
        <p>��Ʒ������<input type="text" name="p_description"></p>
        <input type="submit" value="���">
        <input type="reset" value="����">
    </form>
</center>
</body>
</html>
