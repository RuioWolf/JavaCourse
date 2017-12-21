<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<title>选择图片上传</title>
<META name="verify-v1" content="S+Y0imOx/nWw7HfjS4Iknhar/4IZh+fuZuQn8Z3fdyc=" />
<script language="JavaScript">
function uploadBegin(){
	theFeats = "height=220,width=320,location=no,menubar=no,resizable=no,scrollbars=no,status=no,toolbar=no";
	strAppVersion = navigator.appVersion;
	if (document.uploadForm.file0.value != ""||document.uploadForm.file1.value != ""||document.uploadForm.file2.value != ""||document.uploadForm.file3.value != ""||document.uploadForm.file4.value != "")
	{
	    if (strAppVersion.indexOf('MSIE') != -1 && strAppVersion.substr(strAppVersion.indexOf('MSIE')+5,1) > 4)
	    {	
			winstyle = "dialogWidth=320px; dialogHeight:200px; center:yes";
			window.showModelessDialog(<%="\""+response.encodeURL("progressbar.jsp")+"\""%>,window,winstyle);
	    }
	}
}
function upload_onclick()
{
	window.uploadForm.action="FileUploadAction.jsp";
	uploadBegin();
	window.uploadForm.submit();
}

</script>
</HEAD>
<BODY>
<form  enctype="multipart/form-data" method="post" name="uploadForm" id="uploadForm" onSubmit="uploadBegin();">
<table width="40%"	border="0" align="center" cellpadding="0" cellspacing="0">
       <tr>
         <td align="center" valign="middle" class="titletxt2" style="padding:2px 0px 2px 10px;">请选择上传的文件</td>
       </tr>
       <tr>
         <td align="center">
           <input type="file" name="file0" id="file0" size=55 >
           <input type="file" name="file1" id="file1" size=55 >
           <input type="file" name="file2" id="file2" size=55 >
         </td>
       </tr>
</table>
 <table width="100%" border="0" align=center cellpadding="0" cellspacing="0" >
     <tr>
       <td align=center><input type="button" name="button" value="上 传" onClick="upload_onclick()" style="cursor:hand" ></td>
     </tr>
 </table>
</form>
</BODY>
</HTML>

