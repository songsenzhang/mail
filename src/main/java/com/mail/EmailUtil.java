package com.mail;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
/**
 * 
 * Mail
 * @author : 张松森
 * @E-mail : songsen.zhang@leediancn.com
 * @date : 2016年4月12日 下午6:08:08  
 * @version : 2016年4月12日  张松森 TODO简要描述修改内容，修改原因
 */
public class EmailUtil {
	private static final ResourceBundle bundle = ResourceBundle.getBundle("mail");
	private static final String sendFrom = bundle.getString("email.from");
	private static final String sendHost = bundle.getString("email.host");
	private static final String username = bundle.getString("email.username");
//	private static final String password = bundle.getString("email.password");
	private static final String authCode = bundle.getString("email.authcode");
	private static final String env = bundle.getString("from.env");
	private static final String someone = bundle.getString("email.to");
	private static Message message = null;
	static{
		synchronized(EmailUtil.class)
		{
			init();
		}
	}
	public static void sendEmail_163(String someone, String content){
		try {
			message.setFrom(new InternetAddress(sendFrom));
			message.setRecipients(RecipientType.TO,InternetAddress.parse(someone));
			try {
				message.setSubject(env + "（系统自动邮件,请勿答复）");
				message.setContent(content,"text/html;charset=UTF-8");
				Transport.send(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	public static void sendEmail_163( String content){
		try {
			message.setFrom(new InternetAddress(sendFrom));
			message.setRecipients(RecipientType.TO,InternetAddress.parse(someone));
			try {
				message.setSubject(env + "（系统自动邮件,请勿答复）");
				message.setContent(content,"text/html;charset=UTF-8");
				Transport.send(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	private static void init(){
		Properties props = new Properties();
		props.setProperty("mail.host", sendHost);
		props.setProperty("mail.smtp.auth", "true");
		
		Authenticator authenticator = new Authenticator(){
			@Override
			public PasswordAuthentication getPasswordAuthentication() {
				//老用户使用	密码
//				return new PasswordAuthentication(username,password);
				//新注册账号使用	授权密码
				return new PasswordAuthentication(username,authCode);
			}
		};
		Session session = Session.getDefaultInstance(props, authenticator);
		session.setDebug(false);
		message = new MimeMessage(session);
	}
	
}
