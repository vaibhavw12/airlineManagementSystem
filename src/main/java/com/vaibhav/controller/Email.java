package com.vaibhav.controller;
import java.util.Properties;
import java.util.Random;
import java.util.stream.IntStream;

import javax.mail.*;
import javax.mail.internet.*;

import com.vaibhav.info.CustomerBookings;


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
			  
			  public void SendBookTickets(String receiverEmailID,CustomerBookings CustomerBookings){
				   
				  // Receiver Email Address
				  this.receiverEmailID=receiverEmailID; 
				  // Subject
				  this.emailSubject="Tickets Booked Successfully";
				  // Body
				  this.emailBody="Flight Confirmation From "+CustomerBookings.getSource()+" To "+CustomerBookings.getDestination()+
				  " on "+CustomerBookings.getDate()+" for "+CustomerBookings.getSeats()+" Seats at "+CustomerBookings.getTime();
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
			  
			  public void SendReservation(String receiverEmailID,String source,String destination,String date,String seats,String time){
				   
				  // Receiver Email Address
				  this.receiverEmailID=receiverEmailID; 
				  // Subject
				  this.emailSubject="Reservation Successfully";
				  // Body
				  this.emailBody="Flight Confirmation From "+source+" To "+destination+
				  " on "+date+" for "+seats+" Seats at "+time;
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
			  
			  public void SendPassword(String receiverEmailID,String pass){
				   
				  // Receiver Email Address
				  this.receiverEmailID=receiverEmailID; 
				  // Subject
				  this.emailSubject="Tickets Booked Successfully";
				  // Body
				  this.emailBody="Your Password recover successfully :"+pass;
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

			public void cancel(String email, String source, String destination, String date, String seats,
					String flightTime) {
				// TODO Auto-generated method stub
				// Receiver Email Address
				
				
				  this.receiverEmailID=email; 
				  // Subject
				  this.emailSubject="Reservation Cancelled";
				  // Body
				  this.emailBody="Flight Cancelled "+source+" To "+destination+
				  " on "+date+" for "+seats+" Seats at "+flightTime;
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

	
			  
}
