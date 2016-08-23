package com.codiscope.jaks.triggers.java.spring.mail;

import org.springframework.mail.MailMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * The Class SpringMailForging
 */
public class SpringMailForging {

    private MailSender mailSender;

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void possessiveTest() {
        MailMessage message = new SimpleMailMessage();

        message.setFrom("test@test.test");
        message.setTo("test2@test.test");
        message.setSubject("RE");
        message.setText("Test message");

        mailSender.send((SimpleMailMessage) message);
    }

    public void negativeTest() {

        SimpleMailMessage message = new SimpleMailMessage(new SimpleMailMessage());

        final String from = message.getFrom();
        final String[] to = message.getTo();
        final String subject = message.getSubject();
        final String text = message.getText();

        mailSender.send(message);
    }
}
