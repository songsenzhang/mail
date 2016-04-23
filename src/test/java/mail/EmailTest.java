package mail;


import java.util.Date;

import org.junit.Test;

import com.mail.EmailUtil;
import com.template.TemplateUtil;

import junit.framework.TestCase;


public class EmailTest extends TestCase
{
	@Test
	public void testSendEmail()
	{
		String ENV = "uat415";
		String Package = "com.autodesk.mp.app.cases.v1.api.search";
		String Class = "SearchCaseResource";
		String Method = "getCaseList";
		String Message = "test";
		EmailUtil.sendEmail_163(TemplateUtil.templateForLog(ENV, Package, Class, Method, Message,new Date()));
	}
}
