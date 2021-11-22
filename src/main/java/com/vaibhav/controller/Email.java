package com.vaibhav.controller;
import java.util.Properties;
import java.util.Random;
import java.util.stream.IntStream;

import javax.mail.*;
import javax.mail.internet.*;


public class Email {
	
	final String senderEmailID = "myairlines.2021@gmail.com";
	final String senderPassword = "Myairlines@2021";
	final String emailSMTPserver = "smtp.gmail.com";
	final String emailServerPort = "465";
	String receiverEmailID = null;
	static String emailSubject = "Test Mail";
	static String emailBody = ":)";
	
	public void SendEmail(String receiverEmailID){
			   
			  // Receiver Email Address
			  this.receiverEmailID=receiverEmailID; 
			  // Subject
			  this.emailSubject="Account Created Successfully";
			  // Body
			  this.emailBody="OTP generated :"+opt();
			  Properties props = new Properties();
			  props.put("mail.smtp.user",senderEmailID);
			  props.put("mail.smtp.host", emailSMTPserver);
			  props.put("mail.smtp.port", emailServerPort);
			  props.put("mail.smtp.starttls.enable", "true");
			  props.put("mail.smtp.auth", "true");
			  props.put("mail.smtp.socketFactory.port", emailServerPort);
			  props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			  props.put("mail.smtp.socketFactory.fallback", "false");
			  SecurityManager security = System.getSecurityManager();
			  try{  
			  Authenticator auth = new SMTPAuthenticator();
			  Session session = Session.getInstance(props, auth);
			  MimeMessage msg = new MimeMessage(session);
			  msg.setText(emailBody);
			  msg.setSubject(emailSubject);
			  msg.setFrom(new InternetAddress(senderEmailID));
			  msg.addRecipient(Message.RecipientType.TO,
			  new InternetAddress(receiverEmailID));
			  Transport.send(msg);
			  System.out.println("Message send Successfully:)"); }
			  
			  catch(javax.mail.SendFailedException e){
				  System.out.println("try again");
			  }
			  catch (Exception mex){
			  mex.printStackTrace();}
			  
			  
			  }
			  public class SMTPAuthenticator extends javax.mail.Authenticator
			  {
			  public PasswordAuthentication getPasswordAuthentication()
			  {
			  return new PasswordAuthentication(senderEmailID, senderPassword);
			  }
	}
			  public static int OTP = 0;
			  public String opt() {
				  Random rand = new Random();
				  
			        // Generate random integers in range 10000 to 99999
			        int randNum = rand.nextInt(499);
			  
			        // Print random integers
			        randNum+=1234;
			        
			        OTP = randNum;
			        System.out.println("Random Integers: "+OTP);
					return randNum+"";
			  }
}
