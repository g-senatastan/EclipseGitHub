package com.senatastan.web.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.senatastan.web.entities.UlasFormEntities;

@Service
public class FormEmailService {

	private static final Logger logger = LoggerFactory.getLogger(FormEmailService.class);
	
	private final JavaMailSender mailSender;

    @Value("${spring.mail.username}") 
    private String fromEmail;

    public FormEmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendContactFormMail(UlasFormEntities ulasForm) {
    	try {
    		
    		logger.info("E-posta gönderme işlemi başlıyor...");
    		
    		UlasFormEntities testForm = new UlasFormEntities();
            testForm.setAd_soyad("Test Kullanıcı");
            testForm.setEmail("test@example.com");
            testForm.setMessage("Bu bir test mesajıdır.");
    	
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(fromEmail);
        mailMessage.setTo("g.senatastan@hotmail.com"); 
        mailMessage.setSubject("Yeni İletişim Formu Mesajı");
        mailMessage.setText(
             "Gönderen: " + ulasForm.getAd_soyad() + "\n" +
             "E-posta: " + ulasForm.getEmail() + "\n\n" +
      	     "Mesaj:\n" + ulasForm.getMessage()
        );

        mailSender.send(mailMessage);
        logger.info("E-posta başarıyla gönderildi!");
    } catch (Exception e) {
        logger.error("E-posta gönderilirken hata oluştu!", e);
        }
    }
}
