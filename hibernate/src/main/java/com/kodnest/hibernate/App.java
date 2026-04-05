package com.kodnest.hibernate;
import java.util.*;
import  java.sql.*;
public class App {
    public static void main(String[] args) {
    
     
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter id, houseno,streetname,city, state,country and pincode");
    	address addr = new address(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
    	System.out.println("Entet student id,name,gender,age,college,university,10th,12th,degree");
    	student stu = new student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),addr);
    	Connection con = null;
    	PreparedStatement ps1 =null;
    	PreparedStatement ps2 = null;
    	String dpath ="com.mysql.cj.jdbc.Driver";
    	String url ="jdbc:mysql://localhost:3306/sys?user =root & password = root";
    	
    	String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?)";
    	String sql2 ="insert into address values(?,?,?,?,?,?,?)";
    	try {
            Class.forName(dpath);
    		
    		con = DriverManager.getConnection(url);
    		ps1 = con.prepareStatement(sql);
    		ps2 = con.prepareStatement(sql2);
    		
    		ps1.setInt(1, stu.getId());
    		ps1.setString(2,stu.getName());
    		ps1.setString(3, stu.getGender());
    		ps1.setInt(4, stu.getAge());
    		ps1.setString(5, stu.getCollage());
    		ps1.setString(6, stu.getUniversity());
    		ps1.setInt(7, stu.getTenmarks());
    		ps1.setInt(8, stu.getTwemarks());
    		ps1.setInt(9, stu.getDegmarks());
    		ps1.setInt(10, addr.getId());
    		
    		
    		ps2.setInt(1, addr.getId());
    		ps2.setInt(2,addr.getHouseno());
    		ps2.setString(3, addr.getStreetname());
    		ps2.setString(4, addr.getCity());
    		ps2.setString(5, addr.getState());
    		ps2.setString(6, addr.getCountry());
    		ps2.setInt(7, addr.getPincode());

             int nora1=ps2.executeUpdate();
           int nora2= ps1.executeUpdate();
           
           System.out.println(nora1+nora2+"ROWS Affected");

    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	finally{
    		try {
    		if(con!=null) con.close();
    		if(ps1!=null) ps1.close();
    		if(ps2!=null) ps2.close();

    		if(sc!=null) sc.close();
    		}
    		catch(Exception e2) {
    			e2.printStackTrace();
    		}
    		
    	}
    }
}
