<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="shopBeans.ConnDB" %> 
<%@ page import="java.sql.*" %>
<%
	String admin_name=(String) session.getAttribute("admin_name");
	if(admin_name==null || admin_name=="")
	{
		out.println("<script language='javascript'>alert('���ȵ�¼!');window.location.href='index.jsp';</script>");
	}
	String o_id=(String) request.getParameter("o_id");
	String p_id="",p_name="";
	float p_price=0;
	int p_number=0;
	ConnDB conn=new ConnDB();
	String sql="select p.p_name,o.p_id,o.p_price,o.p_number from product p JOIN orderdetails o ON p.p_id=o.p_id where o.order_id='"+o_id+"'";
	ResultSet rs = conn.doQuery(sql);
	
 %>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {
	font-size: 14px;
}
-->
</style>
</head>

<body>
<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="40" colspan="6" align="center" bgcolor="#99CCFF" class="STYLE2">������Ϣ</td>
    </tr>
  <tr>
    <td height="35" colspan="6" align="left">&nbsp;&nbsp;<font size="2">��������</font>��&nbsp;<font size="2" color="#FF0000"><%= o_id %></font></td>
    </tr>
  <tr>
    <td width="49" align="center" class="STYLE1">���</td>
    <td width="83" height="30" align="center" class="STYLE1">��Ʒ��</td>
    <td width="145" align="center" class="STYLE1">��Ʒ����</td>
    <td width="77" align="center" class="STYLE1">��Ʒ�۸�</td>
    <td width="62" align="center" class="STYLE1">��Ʒ����</td>
    <td width="90" align="center" class="STYLE1">���</td>
  </tr>
  <%
  	int num=1;
	float all_sum=0;
  	while(rs.next())
	{
		p_name=rs.getString(1);
		p_id=rs.getString(2);
		p_price=rs.getFloat(3);
		p_number=rs.getInt(4);
  %>
  <tr>
    <td height="30" align="center" class="STYLE2"><%= num %></td>
    <td height="30" align="center" class="STYLE2"><%= p_id %></td>
    <td height="30" align="center" class="STYLE2"><%= p_name %></td>
    <td height="30" align="center" class="STYLE2"><%= p_price %></td>
    <td height="30" align="center" class="STYLE2"><%= p_number %></td>
    <td height="30" align="center" class="STYLE2"><%= p_price*p_number %></td>
  </tr>
  <% 
  		all_sum=all_sum+(p_price*p_number);
  		num++;
  	}
  %>
  <tr>
    <td height="33" colspan="6" align="right"><font size="2">�ϼƽ��</font>��<font size="3" color="red">��<%= all_sum %></font>&nbsp;&nbsp;&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td height="30" colspan="6" align="center"><input type="button" class="STYLE1" onClick="window.location.href='order_all.jsp'" value=" ���� " /></td>
    </tr>
</table>
</center>