package shopBeans;

import java.util.*;
import java.io.*;
import java.security.*;

public class AvatarSystem
{
	public static String hex(byte[] array)
	{
		StringBuffer sb = new StringBuffer();
		for ( int i = 0; i < array.length; ++i )
		{
			sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString();
	}
	
	public static String md5Hex(String message)
	{
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			return hex(md.digest(message.getBytes("CP1252")));
		} catch ( NoSuchAlgorithmException e )
		{
		} catch ( UnsupportedEncodingException e )
		{
		}
		return null;
	}
	
	public static String getAvatar(String email)
	{
		email = email.toLowerCase();
		//String hex=md5Hex(email);
		return "https://secure.gravatar.com/avatar/" + md5Hex(email) + "?s=32&d=mm";
	}
}
