<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/6
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%!
    public String Bytes(String str) {
        try {
            String strOld = str;
            byte[] strNew = strOld.getBytes("ISO8859-1");
            String bytes = new String(strNew);
            return bytes;
        } catch (Exception e) {
            return null;
        }
    }
%>
