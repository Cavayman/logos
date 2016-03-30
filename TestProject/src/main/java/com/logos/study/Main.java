package com.logos.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	Class.forName("com.mysql.jdbc.Driver");
//	
//	String user="root";
//	String password="123789";
//	String url="";
//	
//	Connection conn=DriverManager.getConnection(url, user, password);
//	Statement statement= conn.createStatement();
//	String q1="select * from taxi.avto";
//	ResultSet s=statement.executeQuery(q1);
//	while(s.next())
//	{
//		System.out.println(s.getString(1)+"   "+s.getString(2)+"   "+s.getString(3)+"   "+s.getString(4));
//	}
//	
//	conn.close();
//	
	UseDB d=new UseDB();
	
	
}
}
