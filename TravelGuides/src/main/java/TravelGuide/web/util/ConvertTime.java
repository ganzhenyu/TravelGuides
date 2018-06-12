package TravelGuide.web.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertTime {
	/**
	* 日期转换成长字符串
	* @param date
	* @return str
	*/
	public static String DateToLongStr(Date date) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String str = format.format(date);
	   return str;
	}
	
	/**
	* 日期转换成短字符串
	* @param date
	* @return str
	*/
	public static String DateToShortStr(Date date) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	   String str = format.format(date);
	   return str;
	}

	/**
	* 字符串转换成日期
	* @param str
	* @return date
	*/
	public static Date StrToDate(String str) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (ParseException e) {
	    e.printStackTrace();
	   }
	   return date;
	}

	public static void main(String[] args) {
	  
	   Date date = new Date();
	   System.out.println("日期转字符串(短)：" + ConvertTime.DateToShortStr(date));
	   System.out.println("日期转字符串(长)：" + ConvertTime.DateToLongStr(date));
	   System.out.println("字符串转日期：" + ConvertTime.StrToDate(ConvertTime.DateToLongStr(date)));
	  
	}
}
