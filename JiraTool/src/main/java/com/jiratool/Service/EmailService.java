package com.jiratool.Service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private TemplateEngine templateEngine;

	@Async
	public void sendEmail(String to, String subject, String text,String reportingManager) throws MessagingException {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		// SimpleMailMessage message = new SimpleMailMessage();
		// message.setFrom("sai.sagar@cgslimited.com");
		helper.setFrom("sai.sagar@cgslimited.com");
		// message.setTo(to);
		helper.setTo(to);
		// message.setSubject(subject);
		helper.setSubject(subject);
		// message.setText(text);
		String emailContent = generateEmailContent(reportingManager);
		helper.setText(emailContent,true);
		/*helper.setText("<html><body>" + "<p>Please Login with Credentials in the below Link:</p>" + "<a href=\""
				+ "http://199.166.155.71:3001" + "\">"
				+ "<img src='cid:image001' alt='Click Here' style='width:200px;height:300px'/>" + "</a>"
				+ "</body></html>", true);*/
		String imagePath = new File("src/main/resources/static/image1.png").getAbsolutePath();
		File imageFile = new File(imagePath);
		if (imageFile.exists()) {

			helper.addInline("image001", imageFile);
		} else {
			throw new MessagingException("Image file not found" + imagePath);
		}
		javaMailSender.send(message);
	}
	
	public String generateEmailContent(String reportingManager) {
		Context con = new Context();
		con.setVariable("reportingManager", reportingManager);
		return templateEngine.process("email-template", con);
	}

}
