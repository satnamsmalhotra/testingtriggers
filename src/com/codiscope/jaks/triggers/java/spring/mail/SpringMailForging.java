package com.codiscope.jaks.triggers.java.spring.mail;

import org.springframework.mail.MailMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/**
 * The Class SpringMailForging
 */
public class SpringMailForging {

    private DatabaseSource databasesource = new DatabaseSource();
    private FileSource filesource = new FileSource();
    private PrivateSource privatesource = new PrivateSource();
    private WebSource websource = new WebSource();
    private WebSourceCookie webcookie = new WebSourceCookie();

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

    public void testSpringSimpleMailMesssage() {
        //Test SimpleMailMesssage when source websource
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject(websource.method2());

        //Test SimpleMailMesssage when source DatabaseSource
        mailMessage.setFrom(databasesource.method2());
        mailMessage.setCc(databasesource.method1());

        //Test SimpleMailMesssage when source WebCookie
        mailMessage.setBcc(webcookie.method5());

        //Test SimpleMailMesssage when source FileDource
        mailMessage.setText(filesource.method1());

        //Test SimpleMailMesssage when source PrivateDource
        mailMessage.setText(privatesource.method1());
    }
}
