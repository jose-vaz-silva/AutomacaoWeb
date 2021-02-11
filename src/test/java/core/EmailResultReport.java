package core;

import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.logging.Level;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


import com.google.common.base.Strings;

public class EmailResultReport {
	public static void main(String[] args) throws Exception {
		
		LinkedHashMap<String, Object> mail = new LinkedHashMap<String, Object>();
		mail.put("smtpHost", System.getProperty("smtpHost"));
		mail.put("smtpPort", System.getProperty("smtpPort"));
		mail.put("mailFrom", System.getProperty("mailFrom"));
		mail.put("mailTo", System.getProperty("mailTo"));
		mail.put("mailSubject", System.getProperty("mailSubject"));
		mail.put("mailBody", System.getProperty("mailBody"));
		mail.put("smtpUsername", System.getProperty("smtpUsername"));
		mail.put("smtpPassord", System.getProperty("smtpPassord"));
		
//		String smtpHost = "smtp.gmail.com";
//		String smtpPort = "25";
//		String mailFrom = System.getProperty("mailFrom");
//		String mailTo = "josevaznt@gmail.com";
//		
//		String smtpUsername = "jenkinssulamericaprojects2020@gmail.com";
//		String smtpPassord = "everis@2020";
//		String mailSubject = "Teste envio de email pelo javaMail";
//		String mailBody = "Teste envio de email pelo javaMail, preencher body";
		
		
	 Properties props = new java.util.Properties();
	    props.put("mail.smtp.host", mail.get("smtpHost").toString());
	    props.put("mail.smtp.port", mail.get("mailFrom").toString());
	    props.put("mail.smtp.auth", "true");             
	    props.put("mail.smtp.starttls.enable", "true");

	    Session session = Session.getInstance(props,
	              new javax.mail.Authenticator() {
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication(mail.get("smtpUsername").toString(), mail.get("smtpPassord").toString());
	                }
	              });


	    Message msg = new MimeMessage(session);
	    try {
	        msg.setFrom(new InternetAddress(mail.get("smtpUsername").toString()));
	        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(mail.get("mailTo").toString()));
	        msg.setSubject(mail.get("mailSubject").toString());

	        Multipart multipart = new MimeMultipart();

	        MimeBodyPart textBodyPart = new MimeBodyPart();
	        textBodyPart.setText(mail.get("mailBody").toString());

	        MimeBodyPart attachmentBodyPart= new MimeBodyPart();
	        DataSource source = new FileDataSource("C:\\Users\\jvazsilv\\Desktop\\automacao - extent report.docx"); // ex : "C:\\test.pdf"
	        attachmentBodyPart.setDataHandler(new DataHandler(source));
	        attachmentBodyPart.setFileName("automacao - extent report.docx"); // ex : "test.pdf"

	        multipart.addBodyPart(textBodyPart);  // add the text part
	        multipart.addBodyPart(attachmentBodyPart); // add the attachement part

	        msg.setContent(multipart);


	        Transport.send(msg);
	    } catch (MessagingException e) {
//	        LOGGER.log(Level.SEVERE,"Error while sending email",e);
	    	throw new Exception(e.getMessage());
	    }
	}
}
