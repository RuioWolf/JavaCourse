<%@page contentType="text/html;charset=utf-8" %>
<html>
<head>
<title>商品搜索</title>
<style type="text/css">
<!--
.style1 {font-size: 15px}
.style2 {color: #FF0000}
-->
</style>
</head>
<body>
<form name="form1" onsubmit="return check()"  method="post" action="search_result.jsp">
  <table width="80%"  border="0" align="center" bgcolor="#0099FF">
    <tr bgcolor="#FFFFFF">
      <th height="39" scope="row"><div align="left">
		<span style="font-weight: 400"><font size="2">查询项目:</font></span></div></th>
      <td><select name="item" size=1>
	<option value="">请选择</option>
	<option value="p_type">商品种类</option>
	<option value="p_id">商品id</option>
	<option value="p_name">商品名字</option>
        </select>
	</td>
	<td><font size="2">查询内容:</font></td>
	<td><input type="text" name="content"></td>
	<td><input type="submit" name="submit" value="查询">
    </tr>
   </table>
</form>
</body>
</html>
<script type="text/javascript">
function check()
{
  if (form1.content.value=="")
  {
    alert("请输入查询内容!");
    form1.content.focus();
    return false;
  }
}
</script>

