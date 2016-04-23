package com.template;

import java.util.Date;

/**
 * 
 * 模板类
 * 提供多种模板进行发送邮件
 * @author : 张松森
 * @E-mail : songsen.zhang@leediancn.com
 * @date : 2016年4月17日 下午6:58:33  
 * @version : 2016年4月17日  张松森 TODO简要描述修改内容，修改原因
 */
public class TemplateUtil
{
	/**
	 * 
	 * @Description：日志形式模板
	 * @param ENV	环境
	 * @param Package	包
	 * @param Class		类
	 * @param Method	方法
	 * @param Message	消息体
	 * @param Date	当前时间
	 * @return: 
	 * 	ENV : uat415
	 * 	Package : com.autodesk.mp.app.cases.v1.api.search
	 * 	Class : SearchCaseResource
	 * 	Method : getCaseList
	 * 	Message : test
	 * 	Date : Sun Apr 17 19:09:52 CST 2016
	 * @throws
	 */
	public static String templateForLog( String ENV, String Package, String Class, String Method, String Message,Date Date )
	{
		StringBuffer sbf = new StringBuffer();
		sbf.append(
			"<style class='fox_global_style'>div.fox_html_content { line-height: 1.5; }div.fox_html_content { font-size: 10.5pt; font-family: 微软雅黑; color: rgb(0, 0, 0); line-height: 1.5; }</style>");
		sbf.append("<div><span id='_FoxCURSOR'></span><b>ENV</b> : " + ENV + "</div>");
		sbf.append(
			"<div><span style='background-color: rgba(0, 0, 0, 0); font-size: 10.5pt; line-height: 1.5;'><b>Package</b>&nbsp;</span><span style='color: rgb(0, 0, 0); background-color: rgba(0, 0, 0, 0);'>: "
					+ Package + "</span></div>");
		sbf.append(
			"<div><span style='color: rgb(0, 0, 0); background-color: rgba(0, 0, 0, 0);'><b>Class</b> :&nbsp;</span><span style='background-color: rgba(0, 0, 0, 0); font-size: 10.5pt; line-height: 1.5;'>"
					+ Class + "</span></div>");
		sbf.append(
			"<div><span style='color: rgb(0, 0, 0); background-color: rgba(0, 0, 0, 0);'><b>Method</b> :&nbsp;</span><span style='background-color: rgba(0, 0, 0, 0); font-size: 10.5pt; line-height: 1.5;'>"
					+ Method + "</span></div>");
		sbf.append("<div><span style='color: rgb(0, 0, 0); background-color: rgba(0, 0, 0, 0);'><b>Message</b> : " + Message + "</span></div>");
		sbf.append("<div><span style='color: rgb(0, 0, 0); background-color: rgba(0, 0, 0, 0);'><b>Date</b> : " + Date + "</span></div>");
		sbf.append("<div><span style='color: rgb(0, 0, 0); background-color: rgba(0, 0, 0, 0);'><br /></span></div>");
		sbf.append("<div><br /></div>");
		sbf.append("<hr id='FMSigSeperator' style='width: 210px; height: 1px;' color='#b5c4df' size='1' align='left' />");
		sbf.append("<div>");
		sbf.append("<span id='_FoxFROMNAME'>");
		sbf.append("<div style='MARGIN: 10px; FONT-FAMILY: verdana; FONT-SIZE: 10pt'>");
		sbf.append("<div>&nbsp; (ld_error@163.com)</div>");
		sbf.append("</div>");
		sbf.append("</span>");
		sbf.append("</div>");
		return sbf.toString();
	}
}
