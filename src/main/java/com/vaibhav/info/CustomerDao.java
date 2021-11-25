package com.vaibhav.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class CustomerDao {
	
	//creating con refrence
		public static Connection create() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/airlineManagementSystem";
				String uname = "root";
				String pass = "@mysql";
				
				Connection con = DriverManager.getConnection(url, uname, pass);
				return con;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
		}
		

		public boolean save(CustomerDetails customerDetails) {
			Connection con = CustomerDao.create();
			int status = 0; 
			try {
				
				//value insert in database
				PreparedStatement ps=con.prepareStatement("insert into records (Name,Email,Password,Mobile) values(?,?,?,?)");
				ps.setString(1, customerDetails.getName());
				ps.setString(2, customerDetails.getEmail());
				ps.setString(3, customerDetails.getPassword());
				ps.setString(4, customerDetails.getMobile());
				//executing query
			    status= ps.executeUpdate();
			}catch (SQLIntegrityConstraintViolationException e) {
				System.out.println("Duplicate");
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(status==1) {
				return true;
			}else {
				return false;
			}
		
		}
		
		public String name=null;
		public boolean check(String email , String password) {
			// TODO Auto-generated method stub
			Connection con = CustomerDao.create();
			
			try {
				PreparedStatement ps=con.prepareStatement("select Name from records where Email=? and Password=?");
				ps.setString(1,email);
				ps.setString(2,password);
			//	System.out.println(ps.executeUpdate());
				ResultSet rs = ps.executeQuery();
				boolean b = rs.next();
				name=rs.getString(1);
				return b;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}

		public boolean myTrips(CustomerBookings customerBookings, String email) {
			Connection con = CustomerDao.create();
			int status = 0; 
			try {
				
				//value insert in database
				PreparedStatement ps=con.prepareStatement("insert into trips (Email,Source,Destination,Date,Seats,Time) values(?,?,?,?,?,?)");
				ps.setString(1, email);
				ps.setString(2, customerBookings.getSource());
				ps.setString(3, customerBookings.getDestination());
				ps.setString(4, customerBookings.getDate());
				ps.setString(5, customerBookings.getSeats());
				ps.setString(6, customerBookings.getTime());
				//executing query
			    status= ps.executeUpdate();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}if(status==1) {
				return true;
			}else {
				return false;
			}
		}
			
		
}
